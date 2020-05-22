// happy coding 👻
// console.log("hello world");
// interface ISingleRepo {
//     name: string;
// }
// interface IRepos {
//     items: Array<ISingleRepo>;
// }
// async function fetchRepo(): Promise<Array<ISingleRepo>> {
//     let res: Response | IRepos = await fetch('https://api.github.com/search/repositories?q=angular');
//     res = await res.json() as IRepos;
//     return res.items;
// }
//
// function createItem(text: string): HTMLLIElement {
//     const item = document.createElement('li') as HTMLLIElement;
//     item.textContent = text;
//     return item;
// }
//
// const container = document.querySelector('.app .list');
//
// async function f() {
//     // step 1: fetch repo
//     const res = await fetchRepo();
//     // step 2: lặp qua mảng các item trả về
//     // step 3: call hàm createItem sau đó truyền vào name của từng item ở mỗi vòng lặp
//     // step 4: call hàm container.appendChild(item mà hàm createItem trả về)
//     res.forEach((item: any) => {
//         const li = createItem(item.name);
//         container.appendChild(li);
//     });
// }
//
// f();



const projects = [];
var htmlTable = ``;

async function getData(query) {
    return new Promise(resolve => {
        fetch(`https://api.github.com/search/repositories?q=${query}`).then(
            (response: Response) => {
                response.json().then(data => projects.push(...data.items));
                resolve();
            }
        );
    });
}
function onSearch(input: HTMLInputElement) {
    htmlTable = ``;
    getData(input.value).then(resolve => {
        drawData().then(resolve => {
            document.getElementById("result").innerHTML = htmlTable;
        });
    });
}

async function drawData() {
    return new Promise(resolve => {
        htmlTable = `
        <table>
            <tr>
                <th>#id</th>
                <th>name</th>
                <th>clone_url</th>
                <th>description</th>
            </tr>
    `;
        projects.map(proj => {
            htmlTable += `<tr>
      <td>${proj.id}</td>
      <td>${proj.name}</td>
      <td>${proj.clone_url}</td>
      <td>${proj.description}</td>
      </tr>`;
        });
        htmlTable += `</table>`;
        console.log(projects);
        resolve();
    });
}
