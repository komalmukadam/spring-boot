
insert into author(id,first_name,last_name,email) values (1,'Dan','Vega','danvega@gmail.com');
insert into author(id,first_name,last_name,email) values (2,'John','Smith','johnsmith@gmail.com');

insert into Post(id,title,slug,teaser,body,author_id,posted_on) values (1,'Spring Boot Rocks!','spring-boot-rocks','Hello','Hi',1,CURRENT_TIMESTAMP);
insert into Post(id,title,slug,teaser,body,author_id,posted_on) values (2,'Spring Data Rocks!','spring-data-rocks','HELLO','HI',1,CURRENT_TIMESTAMP);
insert into Post(id,title,slug,teaser,body,author_id,posted_on) values (3,'John Blog Post 1','john-blog-post-1','HI','HELLO',2,CURRENT_TIMESTAMP);
