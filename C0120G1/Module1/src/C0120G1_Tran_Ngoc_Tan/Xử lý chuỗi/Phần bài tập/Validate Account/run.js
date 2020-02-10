function checkValidateAccount(account) {
    regexp=/^[_a-z0-9]{6,}/;
    if(regexp.test(account)){
        alert("account hợp lệ");

    }else {
        alert("account không hợp lệ");
    }
}