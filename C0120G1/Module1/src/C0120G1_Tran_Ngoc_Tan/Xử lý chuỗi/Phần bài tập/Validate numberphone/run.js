function checkValidatePhone(number) {
    regexp=/^[(][0-9][1-9][)][-][(][0][0-9]{8}[)]$/
    if(regexp.test(number)){
        alert("Số điện thoại hợp lệ");
    }else {
        alert("Số điện thoại không hợp lệ");
    }
}