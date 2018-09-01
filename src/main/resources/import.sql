--1.브라우저를 끄면 사라지는 DB데이터들이라 미리 몇 개 넣어둔 사용자 계정
insert into user(user_id,user_name,password,email) values('test1','test1','1234','test1@naver.com');
insert into user(user_id,user_name,password,email) values('yoobin','yoobin','1234','yoobin@naver.com');


--2.상품
insert into product(product_name,product_contents,product_price,product_img) values('라이언케이블-LionCable','라이언케이블','5000','LionCable');
insert into product(product_name,product_contents,product_price,product_img) values('라이언펜-LionPen','라이언펜','2000','LionPen');