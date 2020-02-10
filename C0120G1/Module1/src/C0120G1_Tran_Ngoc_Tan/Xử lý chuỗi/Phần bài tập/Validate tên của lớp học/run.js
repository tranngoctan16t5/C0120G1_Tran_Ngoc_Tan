function checkValidateClass(lop) {
    regexp=/^[CAP][/.,*&%!@$()||]{0}[0-9]{4}[GHIKLM]$/
    if(regexp.test(lop)){
        alert("Tên lớp hợp lệ");
    }else {
        alert("Tên lớp không hợp lệ");
    }
}