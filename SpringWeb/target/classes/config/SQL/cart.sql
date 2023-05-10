drop table cart;

create table cart(
    cartNum number(8) primary key,
    idx_fk number(8) references member (idx) on delete cascade,
    pnum_fk number(8) references product(pnum) on delete cascade,
    pqty number(8) not null,
    indate date default sysdate,
    constraint cart_pqty_ck check (pqty>0 and pqty<51)
);

drop sequence cart_seq;
create sequence cart_seq nocache;

select * from cart;


--cart와 product조인, subquery
create or replace view cartView
as
select c.*, p.pname, p.pimage1, price, saleprice, point,
(c.pqty * p.saleprice) totalPrice,
(c.pqty * p.point) totalPoint
from cart c join product p
on c.pnum_fk=p.pnum;

select * from cartView where idx_fk=17;

select sum(totalPrice) cartTotalPrice, sum(totalPoint) cartTotalPoint
from cartView where idx_fk=17;
