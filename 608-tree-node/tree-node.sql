# Write your MySQL query statement below
# without join 
-- select id , case when p_id is null then 'Root'
--                 when id in (select P_id from tree) then 'Inner'
--                 else 'Leaf' end as type 
-- from tree

#with joins - joins are faster

select distinct a.id,
                case when a.p_id is null then 'Root'
                     when b.id is null then 'Leaf'
                    else 'Inner' end as type
from tree a
left join tree b 
    on a.id = b.p_id;