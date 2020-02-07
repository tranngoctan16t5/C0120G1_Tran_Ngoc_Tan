var nokia = new Mobile('nokia');
var nokiaResult = document.getElementById('nokiaResult');
var sacpin1 = document.getElementById('sacpin1');
var trangthaipin1 = document.getElementById('trangthaipin1');
var vungnholuutinnhandangsoan1 = document.getElementById('vungnholuutinnhandangsoan1');
var batTatDienThoai1 = document.getElementById("batTatDienThoai1");
var vungnholuutinnhanden1 = document.getElementById('vungnholuutinnhanden1');
var vungnholuutinnhandagui1 = document.getElementById('vungnholuutinnhandagui1');

displayInit(nokia);
nokia.setPin(0);
displayPin(nokia);
var iphone = new Mobile('iphone');
var iphoneResult = document.getElementById('iphoneResult');
var sacpin2 = document.getElementById('sacpin2');
var trangthaipin2 = document.getElementById('trangthaipin2');
var vungnholuutinnhandangsoan2 = document.getElementById('vungnholuutinnhandangsoan2');
var vungnholuutinnhanden2 = document.getElementById('vungnholuutinnhanden2');
var vungnholuutinnhandagui2 = document.getElementById('vungnholuutinnhandagui2');
displayInit(iphone);
iphone.setPin(0);
displayPin(iphone);


function displayInit(element) {
    switch (element.getTenDienThoai()) {
        case "nokia":
            nokiaResult.innerText = element.displayInit();
            break;
        case "iphone":
            iphoneResult.innerText = element.displayInit();
            break;
    }
}


function displayPin(element) {
    switch (element.getTenDienThoai()) {
        case "nokia":
            trangthaipin1.innerText = "Trạng thái pin :" + element.getPin();
            break;
        case "iphone":
            trangthaipin2.innerText = "Trạng thái pin :" + element.getPin();
            break;

    }
}

function sacPin(tenDienThoai) {
    switch (tenDienThoai) {
        case "nokia":
            sacpin1.innerText = "Đang sạc điện thoại " + nokia.sacPin();
            displayPin(nokia);
            break;
        case "iphone":
            sacpin2.innerText = "Đang sạc điện thoại " + iphone.sacPin();
            displayPin(iphone);
            break;
    }
}

function batDienThoai(tenDienThoai) {

    switch (tenDienThoai) {
        case "nokia":

            nokia.batDienThoai();

            nokiaResult.innerText = nokia.kiemTraTrangThaiDienThoai();
            displayPin(nokia);
            break;
        case "iphone":

            iphone.batDienThoai();
            iphoneResult.innerText = iphone.kiemTraTrangThaiDienThoai();
            displayPin(iphone);
            break;
    }
}

function tatDienThoai(tenDienThoai) {

    switch (tenDienThoai) {
        case "nokia":
            nokia.tatDienThoai();

            nokiaResult.innerText = nokia.kiemTraTrangThaiDienThoai();
            displayPin(nokia);
            break;
        case "iphone":
            iphone.tatDienThoai();
            iphoneResult.innerText = iphone.kiemTraTrangThaiDienThoai();
            displayPin(iphone);
            break;
    }
}

function soanTinNhan(tenDienThoai) {
    switch (tenDienThoai) {
        case "nokia":

            if (nokia.getTrangThaiDienThoai() === true) {
                nokia.soanTinNhan(nhaptin1.value);
                vungnholuutinnhandangsoan1.innerText = nokia.getVungNhoLuuTinNhanDangSoanThao().join();
                nhaptin1.value = "";
                displayPin(nokia);
            } else {
                alert("Điện thoại chưa bật ! vui lòng bật điện thoại mới có thể dùng được");
            }
            break;


        case "iphone":
            if (iphone.getTrangThaiDienThoai() === true) {
                iphone.soanTinNhan(nhaptin2.value);
                vungnholuutinnhandangsoan2.innerText = iphone.getVungNhoLuuTinNhanDangSoanThao().join();
                nhaptin2.value = "";
                displayPin(iphone);
            } else {
                alert("Điện thoại chưa bật ! vui lòng bật điện thoại mới có thể dùng được");
            }
            break;


    }
}

function guiTinNhan(tenDienThoai) {
    switch (tenDienThoai) {
        case  "nokia":

            if (iphone.getTrangThaiDienThoai()===true) {
                iphone.guiTinNhan(nokia);
                vungnholuutinnhandagui2.innerText = iphone.getVungNhoLuuTinNhanDaGui().join();
                displayPin(iphone);
                iphoneResult.innerText = "iphone đã gửi đến nokia tin nhắn '" + iphone.getVungNhoLuuTinNhanDaGui().join() + "' thành công";
            } else {
                alert("Điện thoại chưa bật ! vui lòng bật điện thoại mới có thể dùng được");
            }
            break;

        case  "iphone":

            if (nokia.getTrangThaiDienThoai()===true) {
                nokia.guiTinNhan(iphone);
                vungnholuutinnhandagui1.innerText = nokia.getVungNhoLuuTinNhanDaGui().join();
                displayPin(nokia);
                nokiaResult.innerText = "nokia đã gửi đến iphone tin nhắn '" + nokia.getVungNhoLuuTinNhanDaGui().join() + "' thành công";

            }else {
                alert("Điện thoại chưa bật ! vui lòng bật điện thoại mới có thể dùng được");
            }

            break;

    }
}

function nhanTinNhan(tenDienThoai) {
    switch (tenDienThoai) {
        case "nokia":
            if (nokia.getTrangThaiDienThoai()===true) {
                vungnholuutinnhanden1.innerText = nokia.nhanTinNhan().join();
                displayPin(nokia);
            }else {
                alert("Điện thoại chưa bật ! vui lòng bật điện thoại mới có thể dùng được");
            }

            break;
        case "iphone":
            if (iphone.getTrangThaiDienThoai()===true) {
                vungnholuutinnhanden2.innerText = iphone.nhanTinNhan().join();
                displayPin(iphone);
            }else {
                alert("Điện thoại chưa bật ! vui lòng bật điện thoại mới có thể dùng được");
            }

            break;
    }
}

function xemTinNhan(tenDienThoai) {
    switch (tenDienThoai) {
        case "nokia":
            if (nokia.getTrangThaiDienThoai()===true) {
                nokiaResult.innerText = nokia.xemTinNhan();
                displayPin(nokia);
            }else {
                alert("Điện thoại chưa bật ! vui lòng bật điện thoại mới có thể dùng được");
            }

            break;
        case "iphone":
            if (iphone.getTrangThaiDienThoai()===true) {
                iphoneResult.innerText = iphone.xemTinNhan();
                displayPin(iphone);
            }else {
                alert("Điện thoại chưa bật ! vui lòng bật điện thoại mới có thể dùng được");
            }

            break;
    }
}
