create database QLSanpham
use QLSanpham

create table LoaiSP(
	Maloai char(2) primary key,
	Tenloai nvarchar(20)
)

insert into LoaiSP values 
('BK', N'Bánh kẹo'),
('GK', N'Giải khát'),
('MP', N'Mỹ phẩm')

create table Sanpham(
	MaSP char(4) primary key,
	TenSP nvarchar(20),	
	DonGia BigInt,
	MaLoai char(2) foreign key references LoaiSP(MaLoai)
)

insert into Sanpham values
('SP01', N'Bánh mì',10000,'BK'),
('SP02', N'Bánh bao',15000,'BK'),
('SP03', N'Coca cola',12000,'GK'),
('SP04', N'Pepsi',11000,'GK'),
('SP05', N'Kem chống nắng',85000,'MP')



select* from LoaiSP