# DDD 패턴 example

java Spring으로 MSA 관련 DDD 패턴을 예제로 작성을 해보았습니다.

Application -> Domain  -> infrastructure

Database 는 mariaDB를 사용하였으며 jdbc를 이용하였습니다.

Account : GET , POST ,DELETE , PUT
WorkHistory :  GET, POST

간단하게 예제로 작성하였습니다.


현재 AWS EC2에 올라가있습니다.

# ubuntu <-> nginx  <-> ddd_example api  

스웨거를 통해 확인할수 있습니다.
http://3.36.176.139/swagger-ui.html


[![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fwlsgh199%2FDDD&count_bg=%2379C83D&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=hits&edge_flat=false)](https://hits.seeyoufarm.com)
