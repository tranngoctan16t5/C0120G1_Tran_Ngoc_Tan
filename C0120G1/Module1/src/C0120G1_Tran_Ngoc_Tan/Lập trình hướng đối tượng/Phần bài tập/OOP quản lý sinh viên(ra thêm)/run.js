let arrStudent = [];


function displayMainMenu() {
    var chooseMenu = parseInt(prompt(
        "1.Add new Student" +
        "\n2.Display information Student" +
        "\n3.Remove student input keyboard" +
        "\n4.Remove student random" +
        "\n5.Search student student" +
        "\n6.Display Information student" +
        "\n7.Exit"
    ));
    switch (chooseMenu) {
        case 1:
            addNewStudent();
        case 2:
            displayStudent();
        case 3:
            deleteStudent();
        case 4:
            deleteRandomStudent()
        case 5:
            inputSearch();
        case 6:
            sapXep();
        case 7:
            return;
        default:
            alert("Fail");
            displayMainMenu();
    }
}

function addNewStudent() {
    var sinhvien1 = new Student();
    sinhvien1.setMSV(parseInt(prompt("enter code student")));
    sinhvien1.setName(prompt("enter name student"));
    sinhvien1.setBirthday(prompt("enter birthday student"));
    sinhvien1.setGender(prompt("enter gender student"));
    sinhvien1.setLop(prompt("enter lop student"));
    sinhvien1.setKhoa(prompt("enter khoa student"));
    arrStudent.push(sinhvien1);
    // arrStudent.sort(function (a,b){return a-b});
    displayMainMenu();
}

function displayStudent() {
    let result = "";
    for (let i = 0; i < arrStudent.length; i++) {
        result += "\n" + (i + 1) + ".Mã Sinh Viên :" + arrStudent[i].getMSV();
    }
    result += "\n" + (arrStudent.length + 1) + ".Back to menu";
    let chooseStudent = parseInt(prompt(result));
    if (chooseStudent < arrStudent.length + 1) {

        displayInformation(chooseStudent - 1);


    } else {

        displayMainMenu();
    }
}

function displayInformation(index) {
    alert(
        "1.Mã sinh viên : " + arrStudent[index].getMSV() +
        "\n2.Name : " + arrStudent[index].getName() +
        "\n3.Birthday : " + arrStudent[index].getBirthday() +
        "\n4.Gender : " + arrStudent[index].getGender() +
        "\n5.Lop : " + arrStudent[index].getLop() +
        "\n6.khoa : " + arrStudent[index].getKhoa()
    );
    displayMainMenu();
}

function deleteStudent() {
    var nhapMSV = parseInt(prompt("Nhập vào mã sinh viên của sinh viên cần xóa:"));
    var status = "msv";
    displayDeleteStudent(nhapMSV, status);
}

function deleteRandomStudent() {
    var indexRandom = Math.floor(Math.random() * arrStudent.length - 1);
    var status = "auto";
    displayDeleteStudent(indexRandom, status);


}


function displayDeleteStudent(x, status) {
    if (status == "msv") {
        for (let i = 0; i < arrStudent.length; i++) {

            if (arrStudent[i].getMSV() == x) {
                arrStudent.splice(i, 1);
            }
        }
    } else {
        arrStudent.splice(x, 1);
    }
    alert("Delete Thành công!!!");
    displayMainMenu();
}

function inputSearch() {
    var msv = parseInt(prompt("Nhập mã sinh viên cần tìm :"));
    var name = prompt("Nhập tên sinh viên cần tìm:");
    searchStudent(msv, name)
}

function searchStudent(msv, name) {
    for (let i = 0; i < arrStudent.length; i++) {
        if (msv == arrStudent[i].getMSV() || name == arrStudent[i].getName()) {
            displayInformation(i);
        } else {
            alert("Bạn chưa điền thông tin !!!");
            inputSearch();
        }
    }
    displayMainMenu();
}

function sapXep() {

    let result = "";
    let temp = "";
    for (let i = 0; i < arrStudent.length; i++) {

        for (let j = arrStudent.length-1; j > i; j--) {
            if (arrStudent[j].getMSV() < arrStudent[j - 1].getMSV()) {
                temp = arrStudent[j];
                arrStudent[j] = arrStudent[j - 1];
                arrStudent[j - 1] = temp;
            }
        }
    }
    for (let i = 0; i < arrStudent.length; i++) {

        result += "\n" + (i + 1) + ".Mã Sinh Viên :" + arrStudent[i].getMSV() + " Name: " + arrStudent[i].getName();
    }

    alert(result);
    displayMainMenu();
}

displayMainMenu();