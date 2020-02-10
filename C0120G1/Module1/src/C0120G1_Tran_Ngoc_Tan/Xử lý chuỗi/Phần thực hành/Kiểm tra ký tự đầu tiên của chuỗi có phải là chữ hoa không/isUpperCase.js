function isFirstLetterUpperCase(str) {
    var regexp = /^[A-Z]/;
    if (regexp.test(str)) {
        alert("chuỗi có kí tự đầu là chữ hoa");
    } else {
       alert("chuỗi không có kí tự đầu là chữ hoa");
    }

}