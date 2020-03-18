drop database if exists manage_furama;
create database manage_furama;
use manage_furama;

-- bang bo phan

DROP TABLE IF EXISTS bo_phan;
CREATE TABLE bo_phan (
  id_bo_phan int NOT NULL AUTO_INCREMENT,
  ten_bo_phan varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (id_bo_phan)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
LOCK TABLES bo_phan WRITE;
INSERT INTO bo_phan VALUES (1,'Lễ Tân'),(2,'Phòng Khách'),(3,'Buồng'),(4,'Ẩm Thực'),(5,'Vui Chơi-Giải Trí'),(6,'Kỹ thuật');
UNLOCK TABLES;

-- bang vi tri

DROP TABLE IF EXISTS vi_tri;
CREATE TABLE vi_tri (
  id_vi_tri int NOT NULL AUTO_INCREMENT,
  ten_vi_tri varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (id_vi_tri)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES vi_tri WRITE;
UNLOCK TABLES;

-- bang trinh do
DROP TABLE IF EXISTS trinh_do;
CREATE TABLE trinh_do (
  id_trinh_do int NOT NULL AUTO_INCREMENT,
  trinh_do varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (id_trinh_do)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
LOCK TABLES trinh_do WRITE;
INSERT INTO trinh_do VALUES (1,'Đại học '),(2,'Cao đẳng'),(3,'Trung Cấp');
UNLOCK TABLES;

-- bang nhan vien


DROP TABLE IF EXISTS nhan_vien;
CREATE TABLE nhan_vien (
  id_nhan_vien int NOT NULL AUTO_INCREMENT,
  ho_ten varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  id_vi_tri int DEFAULT NULL,
  id_trinh_do int DEFAULT NULL,
  id_bo_phan int DEFAULT NULL,
  ngay_sinh date DEFAULT NULL,
  so_cmnd varchar(45) DEFAULT NULL,
  luong varchar(45) DEFAULT NULL,
  sdt varchar(45) DEFAULT NULL,
  email varchar(45) DEFAULT NULL,
  dia_chi varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (id_nhan_vien),
  KEY fk_nv_bp (id_bo_phan),
  KEY fk_nv_td (id_trinh_do),
  KEY fk_nv_vt (id_vi_tri),
  CONSTRAINT fk_nv_bp FOREIGN KEY (id_bo_phan) REFERENCES bo_phan (id_bo_phan) ON DELETE CASCADE,
  CONSTRAINT fk_nv_td FOREIGN KEY (id_trinh_do) REFERENCES trinh_do (id_trinh_do) ON DELETE CASCADE,
  CONSTRAINT fk_nv_vt FOREIGN KEY (id_vi_tri) REFERENCES vi_tri (id_vi_tri) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES nhan_vien WRITE;
INSERT INTO nhan_vien VALUES (1,'Tran Ngoc Tan',NULL,1,1,'1998-02-02','201775702','6000000','0777958936','tranngoctan@gmail.com','Đà Nẵng'),(2,'Nguyen My Linh',NULL,1,1,'1999-05-06','201854333','5000000','0123402323','nguyenmylinh@gmail.com','Quảng Nam'),(3,'Hoang Van Dung',NULL,2,1,'1996-09-26','201523242','10000000','0312321312','hoangvandung@gmail.com','Quảng Trị'),(4,'Khong Tu Quynh',NULL,2,1,'1988-07-30','200213321','8000000','1231232313','khongtuquynh@gmail.com','Đà Nẵng'),(5,'Tran Nguyen Nhat Cao',NULL,3,1,'2000-08-04','423423443','6000000','1232132344','trannguyennhatcao@gmail.com','Quảng Bình'),(7,'Tran le nguyen',NULL,1,1,'2000-09-09','231232133','6090900','2324343243','trangle@gmail.com','Hà Nội');
UNLOCK TABLES;

-- bang kieu thue

DROP TABLE IF EXISTS kieu_thue;
CREATE TABLE kieu_thue (
   id_kieu_thue int NOT NULL AUTO_INCREMENT,
   ten_kieu_thu varchar(45) DEFAULT NULL,
   Gia int DEFAULT NULL,
  PRIMARY KEY (id_kieu_thue)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
LOCK TABLES kieu_thue WRITE;
INSERT INTO kieu_thue VALUES (1,'Năm',30000000),(2,'Tháng',10000000),(3,'Ngày',1000000),(4,'Giờ',500000);
UNLOCK TABLES;

-- bang loai dich vu

DROP TABLE IF EXISTS loai_dich_vu;
CREATE TABLE loai_dich_vu (
  id_loai_dich_vu int NOT NULL AUTO_INCREMENT,
  ten_loai_dich_vu varchar(45) DEFAULT NULL,
  PRIMARY KEY (id_loai_dich_vu)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
LOCK TABLES loai_dich_vu WRITE;
INSERT INTO loai_dich_vu VALUES (1,'Villa'),(2,'House'),(3,'Room');
UNLOCK TABLES;

-- bang dich vu

DROP TABLE IF EXISTS dich_vu;
CREATE TABLE dich_vu (
   id_dich_vu int NOT NULL AUTO_INCREMENT,
   ten_dich_vu varchar(45) DEFAULT NULL,
   dien_tich int DEFAULT NULL,
   so_tang int DEFAULT NULL,
   so_nguoi_toi_da int DEFAULT NULL,
   chi_phi_thue int DEFAULT NULL,
   id_kieu_thue int DEFAULT NULL,
   id_loai_dich_vu int DEFAULT NULL,
   trang_thai varchar(45) DEFAULT NULL,
  PRIMARY KEY (id_dich_vu),
  KEY fk_hd_ldv (id_loai_dich_vu),
  KEY fk_hd_kt (id_kieu_thue),
  CONSTRAINT fk_hd_kt FOREIGN KEY (id_kieu_thue) REFERENCES kieu_thue (id_kieu_thue),
  CONSTRAINT fk_hd_ldv FOREIGN KEY (id_loai_dich_vu) REFERENCES loai_dich_vu (id_loai_dich_vu)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES dich_vu WRITE;
INSERT INTO dich_vu VALUES (25,'VillaYear',30000,4,15,30000000,1,1,'Còn'),(26,'VillaMonth',20000,3,7,10000000,2,1,'Còn'),(27,'VillaDay',15000,2,5,1000000,3,1,'Còn'),(28,'VillaHour',5000,1,2,500000,4,1,'Full'),(29,'HoueYear',15000,5,8,24000000,1,2,'Còn'),(30,'HouseMonth',10000,3,5,12000000,2,2,'Full'),(31,'HouseDay',5000,2,3,6000000,3,2,'Còn'),(32,'HouseHour',1000,1,2,400000,4,2,'Full'),(33,'RoomYear',1000,4,2,12000000,1,3,'Full'),(34,'RoomMonth',500,3,2,3000000,2,3,'Full'),(35,'RoomDay',200,2,2,1000000,3,3,'Full'),(36,'RoomHour',100,1,2,300000,4,3,'Còn');
UNLOCK TABLES;

-- bang loai khach

DROP TABLE IF EXISTS loai_khach;
CREATE TABLE loai_khach (
  id_loai_khach int NOT NULL AUTO_INCREMENT,
  ten_loai_khach varchar(45) DEFAULT NULL,
  PRIMARY KEY (id_loai_khach)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
LOCK TABLES loai_khach WRITE;
INSERT INTO loai_khach VALUES (1,'Diamond'),(2,'Platinium'),(3,'Gold'),(4,'Silver'),(5,'Member');
UNLOCK TABLES;

-- bang khach hang


DROP TABLE IF EXISTS khach_hang;
CREATE TABLE khach_hang (
  id_khach_hang int NOT NULL AUTO_INCREMENT,
  id_loai_khach int DEFAULT NULL,
  ho_ten varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  ngay_sinh date DEFAULT NULL,
  so_cmnd varchar(45) DEFAULT NULL,
  sdt varchar(45) DEFAULT NULL,
  email varchar(45) DEFAULT NULL,
  dia_chi varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (id_khach_hang),
  KEY fk_kh_lk (id_loai_khach),
  CONSTRAINT fk_kh_lk FOREIGN KEY (id_loai_khach) REFERENCES loai_khach (id_loai_khach) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
LOCK TABLES khach_hang WRITE;
INSERT INTO khach_hang VALUES (1,1,'Nguyen Dinh Hoa','1994-08-06','201775203','0905432256','nguyendinhhoa@gmail.com','Đà Nẵng'),(2,1,'Pham Thai Cuong','1996-04-05','201775202','0905678432','phamthaicuong@gmail.com','Quảng Trị'),(3,2,'Le Dinh Quoc','1992-09-30','207243423','0894321242','ledinhquoc@gmail.com','Quảng Nam'),(4,4,'Pham Minh Hung','1997-06-23','232423343','0904345321','phamminhhung@gmail.com','Quảng Ngãi'),(5,1,'Nguyen Anh Duc','1998-09-30','231231232','0987123123','nguyenanhduc@gmail.com','Vinh'),(6,1,'Nguyen Van Tien','1962-09-12','122231232','0905823233','nguyenvantien@gmail.com','Quảng Ngãi'),(7,2,'Khong Van Tuoc','2000-02-09','123344323','0908232323','khongtuoc@gmail.com','Buôn Mê Thuộc'),(8,4,'Nguyen Dinh Hoa','2000-09-30','423222322','0988122323','nguyenhoa@gmail.com','Đà Nẵng'),(11,1,'Nguyen Cao Ky Duyen','1960-09-15','213123213','0921312332','kyduyenkute@gmail.com','Quảng Trị'),(12,2,'Trần Viết Lê','1988-08-30','203423434','0905678432','tranvietle@gmail.com','Đà Nẵng'),(13,3,'Bui Xuan Hong','1993-07-06','201222122','0905323232','buixuanhong@gmail.com','Quảng Nam'),(14,2,'Ton Ngo Khong','1998-07-04','213123123','0931232333','ngokhong@gmail.com','Hoa qua son');
UNLOCK TABLES;

-- bang dich vu di kem

DROP TABLE IF EXISTS dich_vu_di_kem;
CREATE TABLE dich_vu_di_kem (
  id_dich_vu_di_kem int NOT NULL AUTO_INCREMENT,
  ten_dich_vu_di_kem varchar(45) DEFAULT NULL,
  gia int DEFAULT NULL,
  don_vi int DEFAULT NULL,
  trang_thai_kha_dung varchar(45) DEFAULT NULL,
  PRIMARY KEY (id_dich_vu_di_kem)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
LOCK TABLES dich_vu_di_kem WRITE;
INSERT INTO dich_vu_di_kem VALUES (5,'massage',500000,1,'Good'),(6,'karaoke',300000,1,'Good'),(7,'Food',200000,1,'Còn'),(8,'Drink',200000,1,'Còn'),(9,'Thuê Xe',300000,1,'Còn');
UNLOCK TABLES;

-- bang hop dong

DROP TABLE IF EXISTS hop_dong;
CREATE TABLE hop_dong (
  id_hop_dong int NOT NULL AUTO_INCREMENT,
  id_nhan_vien int DEFAULT NULL,
  id_khach_hang int DEFAULT NULL,
  id_dich_vu int DEFAULT NULL,
  ngay_lam_hop_dong date DEFAULT NULL,
  ngay_ket_thuc date DEFAULT NULL,
  tien_dat_coc int DEFAULT NULL,
  tong_tien int DEFAULT NULL,
  PRIMARY KEY (id_hop_dong),
  KEY fk_hd_dv (id_dich_vu),
  KEY fk_hd_kh (id_khach_hang),
  KEY fk_hd_nv (id_nhan_vien),
  CONSTRAINT fk_hd_dv FOREIGN KEY (id_dich_vu) REFERENCES dich_vu (id_dich_vu) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT fk_hd_kh FOREIGN KEY (id_khach_hang) REFERENCES khach_hang (id_khach_hang) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT fk_hd_nv FOREIGN KEY (id_nhan_vien) REFERENCES nhan_vien (id_nhan_vien) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
LOCK TABLES hop_dong WRITE;
INSERT INTO hop_dong VALUES (1,1,3,30,'2018-07-20','2018-08-20',100000,14000000),(2,2,2,25,'2018-03-05','2019-03-05',20000000,40000000),(3,3,3,27,'2019-02-02','2019-02-03',500000,1000000),(4,5,4,30,'2018-09-23','2019-10-23',6000000,12000000),(5,1,5,30,'2018-06-07','2019-07-07',500000,1000000),(6,4,3,30,'2018-01-20','2018-02-20',100000,14000000),(7,2,6,25,'2018-03-05','2019-03-05',20000000,40000000),(8,3,1,27,'2019-02-02','2019-02-03',500000,1000000),(9,5,1,30,'2018-09-23','2018-10-23',6000000,12000000),(10,1,4,27,'2019-05-05','2019-05-06',500000,1000000),(11,2,5,30,'2019-02-15','2019-03-15',6000000,12000000),(12,3,2,26,'2019-01-20','2019-03-20',5000000,10000000),(13,1,11,29,'2019-07-29','2020-07-19',4000000,80000000),(14,3,12,26,'2019-08-15','2019-09-14',500000,9000000),(15,2,13,31,'2019-12-01','2019-12-02',200000,400000),(16,4,1,27,'2019-10-21','2019-10-22',500000,1000000),(17,7,14,27,'2015-02-09','2015-02-10',500000,1000000);
UNLOCK TABLES;

-- bang chi tiet hop dong
DROP TABLE IF EXISTS hop_dong_chi_tiet;
CREATE TABLE hop_dong_chi_tiet (
  id_hop_dong_chi_tiet int NOT NULL AUTO_INCREMENT,
  id_hop_dong int DEFAULT NULL,
  id_dich_vu_di_kem int DEFAULT NULL,
  so_luong int DEFAULT NULL,
  PRIMARY KEY (id_hop_dong_chi_tiet),
  KEY fk_hdct_hd (id_hop_dong),
  KEY fk_hdct_dvdk (id_dich_vu_di_kem),
  CONSTRAINT fk_hdct_dvdk FOREIGN KEY (id_dich_vu_di_kem) REFERENCES dich_vu_di_kem (id_dich_vu_di_kem),
  CONSTRAINT fk_hdct_hd FOREIGN KEY (id_hop_dong) REFERENCES hop_dong (id_hop_dong)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES hop_dong_chi_tiet WRITE;
INSERT INTO hop_dong_chi_tiet VALUES (11,1,5,2),(12,2,6,1),(13,3,6,3),(14,4,8,1),(15,5,9,2),(16,6,7,3),(17,7,6,2),(18,8,7,1),(19,9,5,4),(20,10,6,1),(21,11,5,2),(26,12,6,3),(27,13,7,2),(28,14,7,1),(29,15,9,1),(30,16,7,1),(31,17,7,1);
UNLOCK TABLES;

                                        -- BAI TAP CASE STUDY--
-- task 2
-- Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự
--  “H”, “T” hoặc “K” và có tối đa 15 ký tự.	
select * 
from nhan_vien
where (ho_ten like 'H%' or ho_ten like 'T%' or ho_ten like 'K%')  and length(ho_ten)<=15;								

-- task 3
-- Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * 
from khach_hang
where  ((year(now())-year(ngay_sinh)) between 18 and 50) and (dia_chi='Đà Nẵng' or dia_chi='Quảng Trị');

-- task 4
-- Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo 
-- số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select kh.ho_ten,count(*) as SoLanDatPhong
from (hop_dong hd join khach_hang kh on hd.id_khach_hang=kh.id_khach_hang) join loai_khach lk on lk.id_loai_khach=kh.id_loai_khach
where lk.ten_loai_khach='Diamond'
group by kh.ho_ten
order by SoLanDatPhong;

-- task 5
-- Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien
--  (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem)
--  cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select a.id_khach_hang,a.ho_ten,b.id_hop_dong,b.ngay_lam_hop_dong,b.ngay_ket_thuc,(c.chi_phi_thue + d.so_luong * e.gia) as TongTien
from (((khach_hang a left join hop_dong b on a.id_khach_hang=b.id_khach_hang) left join dich_vu c on c.id_dich_vu=b.id_dich_vu)left join hop_dong_chi_tiet d
      on d.id_hop_dong=b.id_hop_dong) left join dich_vu_di_kem e on e.id_dich_vu_di_kem=d.id_dich_vu_di_kem  ;

-- task 6
-- Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện 
-- đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3). 

select id_dich_vu,ten_dich_vu,dien_tich,chi_phi_thue,ten_loai_dich_vu
 from dich_vu dv,loai_dich_vu ldv
 where dv.id_loai_dich_vu=ldv.id_loai_dich_vu  
   and
       (id_dich_vu not in (select id_dich_vu 
                        from hop_dong  )
   or
      (id_dich_vu  in(select id_dich_vu
					  from hop_dong
                      where year(ngay_lam_hop_dong)=2018))
	  and
       (id_dich_vu not in(select id_dich_vu
					   from hop_dong
                       where year(ngay_lam_hop_dong)=2019)));
 
-- task 7
-- Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ đã từng được
--  Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.

select id_dich_vu,ten_dich_vu,dien_tich,chi_phi_thue,ten_loai_dich_vu
from dich_vu dv,loai_dich_vu ldv
where (id_dich_vu in(select id_dich_vu
                  from hop_dong 
                  where ngay_lam_hop_dong between '2018-01-01'and '2018-12-31')) and (id_dich_vu not in(select id_dich_vu
                                                                                                  from hop_dong
                                                                                                  where year(ngay_lam_hop_dong)=2019)) and dv.id_loai_dich_vu=ldv.id_loai_dich_vu;
 
-- task 8
-- Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên


-- Cách 1:
select distinct ho_ten
from khach_hang;

-- Cách 2:
select ho_ten
from khach_hang
group by ho_ten;

-- task 9
-- Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(ngay_lam_hop_dong) as thang,count(month(ngay_lam_hop_dong)) as sokhachhangdatphong
from hop_dong
where year(ngay_lam_hop_dong)=2019
group by thang;

-- task 10
-- Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. Kết quả hiển thị bao gồm IDHopDong
-- , NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).

select a.id_hop_dong,ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,so_luong
from hop_dong a,hop_dong_chi_tiet b
where a.id_hop_dong=b.id_hop_dong;

-- task 11
-- Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond”
--  và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select *
from dich_vu_di_kem
where id_dich_vu_di_kem IN (select id_dich_vu_di_kem
                        from hop_dong_chi_tiethopdongchitiet
                        where id_hop_dong IN(select id_hop_dong
                                           from hop_dong
					                       where id_khach_hang IN(select id_khach_hang
                                                               from khach_hang a,loai_khach b
                                                                where (a.id_loai_khach=b.id_loai_khach) and ((b.ten_loai_khach='Diamond') and (a.dia_chi='Vinh' or a.dia_chi='Quảng Ngãi')))));

-- task 12
-- Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm
--  2019 nhưng chưa 	từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select hd.id_hop_dong,nv.ho_ten as ten_nhan_vien,kh.ho_ten as ten_khach_hang,kh.sdt as SoDienThoaiKhachHang,ten_dich_vu,tien_dat_coc,so_luong as SoLuongDichVuDiKem
from (((hop_dong hd join dich_vu dv on hd.id_dich_vu=dv.id_dich_vu) join khach_hang kh on hd.id_khach_hang=kh.id_khach_hang) join nhan_vien nv on hd.id_nhan_vien=nv.id_nhan_vien)join hop_dong_chi_tiet hdct on hdct.id_hop_dong=hd.id_hop_dong
where
    (hd.id_dich_vu in(select id_dich_vu
                from hop_dong
                where month(ngay_lam_hop_dong) in(10,11,12) and year(ngay_lam_hop_dong)=2019))
    and
    (hd.id_dich_vu not in(select id_dich_vu 
                       from hop_dong
					   where month(ngay_lam_hop_dong) in (1,2,3,4,5,6) and year(ngay_lam_hop_dong)=2019)) ;

-- task 13
-- Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng
-- . (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select *
 from dich_vu_di_kem
 where id_dich_vu_di_kem in(
     select id_dich_vu_di_kem
     from
   (select id_dich_vu_di_kem,count(id_dich_vu_di_kem) as SL
   from hop_dong_chi_tiet
   group by id_dich_vu_di_kem
   having SL= (select max(soluongDV)
			from
                      (select id_dich_vu_di_kem,count(*) as soluongDV
                       from hop_dong_chi_tiet
 
                    group by id_dich_vu_di_kem) as S)) as B);

-- task 14
-- Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
--  Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
select hd.id_hop_dong,ldv.ten_loai_dich_vu,ten_dich_vu_di_kem
from (((hop_dong hd join dich_vu dv on hd.id_dich_vu=dv.id_dich_vu) join loai_dich_vu ldv on ldv.id_loai_dich_vu=dv.id_loai_dich_vu) 
      join hop_dong_chi_tiet hdct on hdct.id_hop_dong=hd.id_hop_dong)join dich_vu_di_kem dvdk on dvdk.id_dich_vu_di_kem=hdct.id_dich_vu_di_kem
where
   hdct.id_dich_vu_di_kem in(select id_dich_vu_di_kem
                    from hop_dong_chi_tiet
                    group by id_dich_vu_di_kem
                    having count(id_dich_vu_di_kem)=1);

-- task 15
-- Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
select nv.id_nhan_vien,ho_ten,td.trinh_do,bp.ten_bo_phan,nv.sdt as SoDienThoai,dia_chi 
from ((nhan_vien nv join bo_phan bp on nv.id_bo_phan=bp.id_bo_phan) join hop_dong hd on hd.id_nhan_vien=nv.id_nhan_vien)join trinh_do td on nv.id_trinh_do=td.id_trinh_do
where 
     hd.id_nhan_vien in (select id_nhan_vien
                       from
                       (select id_nhan_vien,count(*) as SLNV
					    from hop_dong
						where
                             year(ngay_lam_hop_dong) between 2018 and 2019
						     group by id_nhan_vien
						      Having SLNV<=3) as B1)
                            group by id_nhan_vien ;

-- task 16
-- Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
SET SQL_SAFE_UPDATES=0;  
delete from nhan_vien  where id_nhan_vien not in (select id_nhan_vien
                                        from hop_dong 
                                        where year(ngay_lam_hop_dong) between 2017 and 2019 );
 SET SQL_SAFE_UPDATES=1; 


-- task 17
-- Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng
--  với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
 SET SQL_SAFE_UPDATES=0; 
update khach_hang set id_loai_khach="1"
where id_khach_hang in (
                       select id_khach_hang
                         from hop_dong
                         where Year(ngay_lam_hop_dong)=2019
                         group by id_khach_hang
                          having sum(tong_tien)>10000000);
 SET SQL_SAFE_UPDATES=1; 

-- task 18
-- 	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).
SET SQL_SAFE_UPDATES=0;  
 delete from khach_hang  where id_khach_hang in (select id_khach_hang
                                             from hop_dong
	                                     where id_khach_hang and year(ngay_lam_hop_dong)<2016);
 SET SQL_SAFE_UPDATES=1;

-- task 19
-- Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi. 
SET SQL_SAFE_UPDATES=0; 
 update dich_vu_di_kem set gia=gia*2
 where
 id_dich_vu_di_kem in
 (select id_dich_vu_di_kem 
 from (hop_dong hd join hop_dong_chi_tiet hdct on hd.id_hop_dong=hdct.id_hop_dong)
 where year(hd.ngay_lam_hop_dong)=2019 
 group by id_dich_vu_di_kem
 having count(hdct.id_dich_vu_di_kem)>10);
 SET SQL_SAFE_UPDATES=1;  

-- task 20
-- Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm ID
 (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.

select id_nhan_vien as ID,ho_ten,email,sdt,ngay_sinh,dia_chi
from nhan_vien
union all
select id_khach_hang as ID,ho_ten,email,sdt,ngay_sinh,dia_chi
from khach_hang 

  					
