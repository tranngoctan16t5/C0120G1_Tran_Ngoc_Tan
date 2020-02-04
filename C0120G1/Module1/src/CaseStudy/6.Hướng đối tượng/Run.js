let listCustomers = [];
let checkDeleteCustomer=false;
let checkEditCustomer=false;
let checkDisplayTotalPay=false;
let validateBirthday = /^((0)[1-9]|[1-2][0-9]|(3)[0-1])(\/)((0)[1-9]|((1)[0-2]))(\/)\d{4}$/;
let validateEmail = /^[a-z][a-z0-9_\.]{5,32}@[a-z0-9]{2,}(\.[a-z0-9]{2,4}){1,2}$/gm;

function displayMainmenu() {
    let choose = prompt(
        "1.Add new customer." +
        "\n2.Display information customer." +
        "\n3.total Pay." +
        "\n4.Edit information customer" +
        "\n5.Delete  customer." +
        "\n6.Exit."
    );
    switch (choose) {
        case "1":
            addNewCustomer();
            break;
        case "2":
            displayCustomers();
            break;
        case "3":
            chooseDisplayTotalPay();
            break;
        case "4":
            chooseCustomerEdit();
            break;
        case "5":
            chooseDeleteCustomer();
            break;
        case 6:
            return;
        default:
            alert("Fail!!");
            displayMainmenu();
            break;

    }
}

function addNewCustomer() {
    let checkBirthday = false;
    let checkEmail = false;
    let cus = new Customer();
    cus.setNameCustomer(prompt("Enter name customer"));
    cus.setIdCard(prompt("Enter id card"));

    do {
        cus.setBirthdayCustomer(prompt("Enter birthday"));
        if (validateBirthday.test(cus.getBirthdayCustomer())) {
            checkBirthday = true;
        } else {
            alert("Birth is invalid. please try again !!!");
        }
    }
    while (!checkBirthday);

    do {
        cus.setEmailCustomer(prompt("Enter email"));
        if (validateEmail.test(cus.getEmailCustomer())) {
            checkEmail = true;
        } else {
            alert("Email is invalid. please try again !!!")
        }

    }
    while (!checkEmail);
    cus.setAddressCustomer(prompt("Enter address"));
    cus.setTypeCustomer(prompt("Enter type customer"));
    cus.setDiscount(prompt("Enter Discount"));
    cus.setNumberOfAccompanying(prompt("Enter NumberOfAccompanying"));
    cus.setTypeRoom(prompt("Enter type room"));
    cus.setRentDays(prompt("Enter rent day"));
    cus.setTypeService(prompt("Enter type service"));
    listCustomers.push(cus);
    displayMainmenu();

}

function displayCustomers() {
    let result = "";
    for (var i = 0; i < listCustomers.length; i++) {
        result += "\n" + (i + 1) + "." + "name: " + listCustomers[i].getNameCustomer() +
            "; Id Card: " + listCustomers[i].getIdCard();
    }
    result += "\n" + (listCustomers.length + 1) + ".Back to menu.";
    let chooseDisplayInfor = prompt(result);
    if (chooseDisplayInfor.toString() != (listCustomers.length + 1).toString()) {
        if (!checkDeleteCustomer && !checkDisplayTotalPay) {
            displayInformationCustomer(Number.parseInt(chooseDisplayInfor) - 1);
        } else if(checkDeleteCustomer){
            deleteCustomer(Number.parseInt(chooseDisplayInfor) - 1);
        }else{
            displayTotalPay(Number.parseInt(chooseDisplayInfor)-1);
        }
    } else {
        checkDisplayTotalPay=false;
        checkDeleteCustomer = false;
        checkEditCustomer = false;
        displayMainmenu();
    }

}

function displayInformationCustomer(index) {
    if (checkEditCustomer) {
        let chooseInforEdit = prompt(
            "1.Name :" + listCustomers[index].getNameCustomer() +
            "\n2.Id card :" + listCustomers[index].getIdCard() +
            "\n3.Birthday : " + listCustomers[index].getBirthdayCustomer() +
            "\n4.Email : " + listCustomers[index].getEmailCustomer() +
            "\n5.Address : " + listCustomers[index].getAddressCustomer() +
            "\n6.Type Customer : " + listCustomers[index].getTypeCustomer() +
            "\n7.Discount : " + listCustomers[index].getDiscount() +
            "\n8.Accompanying : " + listCustomers[index].getNumberOfAccompanying() +
            "\n9.Type Room : " + listCustomers[index].getTypeRoom() +
            "\n10.Rent Days : " + listCustomers[index].getRentDays() +
            "\n11.Type Service : " + listCustomers[index].getTypeService() +
            "\n12.Back"
        );
        if (chooseInforEdit.toString() !== "12") {
            editInformationCustomer(index, Number.parseInt(chooseInforEdit) - 1);
        } else {
            checkEditCustomer = false;
            displayCustomers();
        }
    } else {


        alert("Information of customer:\n" +
            "Name :" + listCustomers[index].getNameCustomer() +
            "\nId card :" + listCustomers[index].getIdCard() +
            "\nBirthday : " + listCustomers[index].getBirthdayCustomer() +
            "\nEmail : " + listCustomers[index].getEmailCustomer() +
            "\nAddress : " + listCustomers[index].getAddressCustomer() +
            "\nType Customer : " + listCustomers[index].getTypeCustomer() +
            "\nDiscount : " + listCustomers[index].getDiscount() +
            "\nAccompanying : " + listCustomers[index].getNumberOfAccompanying() +
            "\nType Room : " + listCustomers[index].getTypeRoom() +
            "\nRent Days : " + listCustomers[index].getRentDays() +
            "\nType Service : " + listCustomers[index].getTypeService()
        );
        displayMainmenu();
    }
}

//




function chooseDisplayTotalPay() {
    checkDisplayTotalPay=true;
    displayCustomers();
}
function displayTotalPay(index) {
    alert(listCustomers[index].totalPays());
    checkDisplayTotalPay=false;
    displayMainmenu();
}
function chooseCustomerEdit() {
    checkEditCustomer = true;
    displayCustomers();
}
function editInformationCustomer(index, editIndex) {
    let editInfor = prompt("Enter Info You Want Change:");
    switch (editIndex) {
        case 0:
            listCustomers[index].setNameCustomer( editInfor) ;
            break;
        case 1:
            listCustomers[index].setIdCard(editInfor) ;
            break;
        case 2:
            listCustomers[index].setBirthdayCustomer(editInfor) ;
            break;
        case 3:
            listCustomers[index].setEmailCustomer(editInfor) ;
            break;
        case 4:
            listCustomers[index].setAddressCustomer(editInfor);
            break;
        case 5:
            listCustomers[index].setTypeCustomer(editInfor)  ;
            break;
        case 6:
            listCustomers[index].setDiscount(editInfor)  ;
            break;
        case 7:
            listCustomers[index].setNumberOfAccompanying(editInfor) ;
            break;
        case 8:
            listCustomers[index].setTypeRoom(editInfor) ;
            break;
        case 9:
            listCustomers[index].setRentDays(editInfor) ;
            break;
        case 10:
            listCustomers[index].setTypeService(editInfor);
            break;
        default:
            alert("Fail!!");
            return;
    }
    checkEditCustomer = false;
    displayMainmenu();

}
function chooseDeleteCustomer() {
    checkDeleteCustomer=true;
    displayCustomers();
}
function deleteCustomer(index) {
    let chooseConfirm=prompt(
        "Are you sure delete customer: Name:"+listCustomers[index].getNameCustomer()+
        ";Id card: "+listCustomers[index].getIdCard()+
        "\n1.Yes\n2.No"
    );
    if(chooseConfirm==="1"){
        listCustomers.splice(index,1);
        alert("Delete Complete!!!");
    }
    checkDeleteCustomer=false;
    displayMainmenu();
}
displayMainmenu();