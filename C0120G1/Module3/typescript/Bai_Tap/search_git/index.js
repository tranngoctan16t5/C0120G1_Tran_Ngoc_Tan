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
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
const projects = [];
var htmlTable = ``;
function getData(query) {
    return __awaiter(this, void 0, void 0, function* () {
        return new Promise(resolve => {
            fetch(`https://api.github.com/search/repositories?q=${query}`).then((response) => {
                response.json().then(data => projects.push(...data.items));
                resolve();
            });
        });
    });
}
function onSearch(input) {
    htmlTable = ``;
    getData(input.value).then(resolve => {
        drawData().then(resolve => {
            document.getElementById("result").innerHTML = htmlTable;
        });
    });
}
function drawData() {
    return __awaiter(this, void 0, void 0, function* () {
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
    });
}
