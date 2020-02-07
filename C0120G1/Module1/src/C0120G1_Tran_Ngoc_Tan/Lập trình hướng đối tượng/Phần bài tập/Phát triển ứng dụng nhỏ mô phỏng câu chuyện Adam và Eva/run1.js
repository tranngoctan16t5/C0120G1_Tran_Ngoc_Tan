var adam=new Human('adam',20,45);


var eva=new Human('eva',23,60);

var tao=new Tao(10);

function goiTen(name) {
    switch (name) {
        case "adam":
            alert( "Tôi Tên Là :"+adam.getName());
            break;
        case "eva":
            alert( "Tôi Tên Là :"+eva.getName());
            break;

    }

}
function goiTuoi(name) {
    switch (name) {
        case "adam":
            alert( "Năm nay tôi tròn :"+adam.getAge(20)+" tuổi");
            break;
        case "eva":
            alert( "Năm nay tôi tròn :"+eva.getAge(20)+" tuổi");
            break;

    }
}
function goiGioiTinh(name) {
    switch (name) {
        case "adam":
            alert(adam.checkGender());
            break;
        case "eva":
            alert(eva.checkGender());
            break;
    }
}
function chaoHoi(name) {
    switch (name) {
        case "adam":
            alert(adam.say('Adam xin chào tất cả bà con !!!'));
            break;
        case "eva":
            alert(eva.say('Eva xin chào tất cả bà con !!!'));
            break;
    }
}
function canNang(name) {
    switch (name) {
        case "adam":
            alert("Tôi nặng "+adam.getWeight()+"kg");
            break;
        case "eva":
            alert("Tôi nặng "+adam.getWeight()+"kg");
            break;
    }
}
function donViTao() {
    alert("Số quả táo trên cây là :"+tao.getWeight());
}
function kiemTraTao(name) {
    switch (name) {

        case "adam":
            alert("Số táo:"+adam.kiemTraTao());
            break;
        case "eva":
            alert("Số táo:"+eva.kiemTraTao());
            break;
    }
}
function anTao(name) {
    switch (name) {
        case "adam":
            if(tao.getWeight()!=0){
                alert("Cân nặng :" +adam.getWeight()+
                    "\nKhối lượng táo:"+tao.getWeight());
            }else{
                alert("Hết táo rồi !!! ăn cái khác đi");
            }
            break;
        case "eva":
            if(tao.getWeight()!=0){
                alert("Cân nặng :" +eva.getWeight()+
                    "\nKhối lượng táo:"+tao.getWeight());
            }else{
                alert("Hết táo rồi !!! ăn cái khác đi");
            }
            break;

    }
}

