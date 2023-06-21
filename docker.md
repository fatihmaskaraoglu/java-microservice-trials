```
docker run in28min/todo-rest-api-h2:1.0.0.RELEASE locally
docker run -p 5000:5000 in28min/todo-rest-api-h2:1.0.0.RELEASE locally
https://hub.docker.com/

C:\Users\fatih>docker run -p 5000:5000 -d in28min/todo-rest-api-h2:1.0.0.RELEASE locally
902768c3f06b5c31e5a5df81bc39464e6835643d2230965f40a1961928afa8f2

C:\Users\fatih>docker logs 902768c3f06b5c31e5a5df81bc39464e6835643d2230965f40a1961928afa8f2

C:\Users\fatih>docker container ls
CONTAINER ID   IMAGE                                    COMMAND                  CREATED              STATUS              PORTS                    NAMES
902768c3f06b   in28min/todo-rest-api-h2:1.0.0.RELEASE   "sh -c 'java $JAVA_O…"   About a minute ago   Up About a minute   0.0.0.0:5000->5000/tcp   elastic_wright

C:\Users\fatih>docker run -p 5001:5000 -d in28min/todo-rest-api-h2:1.0.0.RELEASE locally
1a018bda95476a1af345894568943aaa74499aeeb8e0bf4d9b0231481b9d6e81

C:\Users\fatih>docker container ls
CONTAINER ID   IMAGE                                    COMMAND                  CREATED              STATUS              PORTS                    NAMES
1a018bda9547   in28min/todo-rest-api-h2:1.0.0.RELEASE   "sh -c 'java $JAVA_O…"   About a minute ago   Up About a minute   0.0.0.0:5001->5000/tcp   gallant_yalow
902768c3f06b   in28min/todo-rest-api-h2:1.0.0.RELEASE   "sh -c 'java $JAVA_O…"   3 minutes ago        Up 3 minutes        0.0.0.0:5000->5000/tcp   elastic_wright

C:\Users\fatih>docker images
REPOSITORY                 TAG             IMAGE ID       CREATED         SIZE
mysql                      8-oracle        c71276df4a87   2 weeks ago     565MB
in28min/todo-rest-api-h2   1.0.0.RELEASE   9d05dd98f4a4   12 months ago   143MB

C:\Users\fatih>docker container ls -a
CONTAINER ID   IMAGE                                    COMMAND                  CREATED          STATUS                       PORTS                               NAMES
1a018bda9547   in28min/todo-rest-api-h2:1.0.0.RELEASE   "sh -c 'java $JAVA_O…"   2 minutes ago    Up 2 minutes                 0.0.0.0:5001->5000/tcp              gallant_yalow
902768c3f06b   in28min/todo-rest-api-h2:1.0.0.RELEASE   "sh -c 'java $JAVA_O…"   4 minutes ago    Up 4 minutes                 0.0.0.0:5000->5000/tcp              elastic_wright
20186d640050   in28min/todo-rest-api-h2:1.0.0.RELEASE   "sh -c 'java $JAVA_O…"   5 minutes ago    Exited (130) 5 minutes ago                                       condescending_sammet
d01396168078   in28min/todo-rest-api-h2:1.0.0.RELEASE   "sh -c 'java $JAVA_O…"   41 minutes ago   Exited (130) 5 minutes ago                                       wonderful_edison
a7b18e03ff47   mysql:8-oracle                           "docker-entrypoint.s…"   7 days ago       Exited (0) 48 minutes ago    0.0.0.0:3306->3306/tcp, 33060/tcp   mysql


C:\Users\fatih>docker container stop 1a018bda9547
1a018bda9547

C:\Users\fatih>docker container ls -a
CONTAINER ID   IMAGE                                    COMMAND                  CREATED          STATUS                       PORTS                               NAMES
1a018bda9547   in28min/todo-rest-api-h2:1.0.0.RELEASE   "sh -c 'java $JAVA_O…"   2 minutes ago    Exited (143) 2 seconds ago                                       gallant_yalow
902768c3f06b   in28min/todo-rest-api-h2:1.0.0.RELEASE   "sh -c 'java $JAVA_O…"   5 minutes ago    Up 5 minutes                 0.0.0.0:5000->5000/tcp              elastic_wright
20186d640050   in28min/todo-rest-api-h2:1.0.0.RELEASE   "sh -c 'java $JAVA_O…"   6 minutes ago    Exited (130) 6 minutes ago                                       condescending_sammet
d01396168078   in28min/todo-rest-api-h2:1.0.0.RELEASE   "sh -c 'java $JAVA_O…"   42 minutes ago   Exited (130) 6 minutes ago                                       wonderful_edison
a7b18e03ff47   mysql:8-oracle                           "docker-entrypoint.s…"   7 days ago       Exited (0) 49 minutes ago    0.0.0.0:3306->3306/tcp, 33060/tcp   mysql



C:\Users\fatih>docker tag in28min/todo-rest-api-h2:1.0.0.RELEASE in28min/todo-rest-api-h2:latest

C:\Users\fatih>docker images
REPOSITORY                 TAG             IMAGE ID       CREATED         SIZE
mysql                      8-oracle        c71276df4a87   2 weeks ago     565MB
in28min/todo-rest-api-h2   1.0.0.RELEASE   9d05dd98f4a4   12 months ago   143MB
in28min/todo-rest-api-h2   latest          9d05dd98f4a4   12 months ago   143MB


C:\Users\fatih>docker search mysql
NAME                            DESCRIPTION                                     STARS     OFFICIAL   AUTOMATED
mysql                           MySQL is a widely used, open-source relation…   14247     [OK]
mariadb                         MariaDB Server is a high performing open sou…   5447      [OK]
percona                         Percona Server is a fork of the MySQL relati…   616       [OK]
phpmyadmin                      phpMyAdmin - A web interface for MySQL and M…   826       [OK]
bitnami/mysql                   Bitnami MySQL Docker Image                      90                   [OK]
circleci/mysql                  MySQL is a widely used, open-source relation…   29
bitnami/mysqld-exporter                                                         5
ubuntu/mysql                    MySQL open source fast, stable, multi-thread…   51
cimg/mysql                                                                      0
rapidfort/mysql                 RapidFort optimized, hardened image for MySQL   23
rapidfort/mysql8-ib             RapidFort optimized, hardened image for MySQ…   9
google/mysql                    MySQL server for Google Compute Engine          23                   [OK]
hashicorp/mysql-portworx-demo                                                   0
rapidfort/mysql-official        RapidFort optimized, hardened image for MySQ…   7
newrelic/mysql-plugin           New Relic Plugin for monitoring MySQL databa…   1                    [OK]
databack/mysql-backup           Back up mysql databases to... anywhere!         86
linuxserver/mysql               A Mysql container, brought to you by LinuxSe…   38
bitnamicharts/mysql                                                             0
mirantis/mysql                                                                  0
docksal/mysql                   MySQL service images for Docksal - https://d…   0
linuxserver/mysql-workbench                                                     50
vitess/mysqlctld                vitess/mysqlctld                                1                    [OK]
eclipse/mysql                   Mysql 5.7, curl, rsync                          0                    [OK]
drupalci/mysql-5.5              https://www.drupal.org/project/drupalci         3                    [OK]
drupalci/mysql-5.7              https://www.drupal.org/project/drupalci         0


C:\Users\fatih>docker image history c71276df4a87
IMAGE          CREATED       CREATED BY                                      SIZE      COMMENT
c71276df4a87   2 weeks ago   /bin/sh -c #(nop)  CMD ["mysqld"]               0B
<missing>      2 weeks ago   /bin/sh -c #(nop)  EXPOSE 3306 33060            0B
<missing>      2 weeks ago   /bin/sh -c #(nop)  ENTRYPOINT ["docker-entry…   0B
<missing>      2 weeks ago   /bin/sh -c ln -s usr/local/bin/docker-entryp…   34B
<missing>      2 weeks ago   /bin/sh -c #(nop) COPY file:e9c22353a1133b89…   14.2kB
<missing>      2 weeks ago   /bin/sh -c #(nop)  VOLUME [/var/lib/mysql]      0B
<missing>      2 weeks ago   /bin/sh -c set -eux;  microdnf install -y "m…   253MB
<missing>      2 weeks ago   /bin/sh -c #(nop)  ENV MYSQL_SHELL_VERSION=8…   0B
<missing>      2 weeks ago   /bin/sh -c set -eu;  . /etc/os-release;  {  …   215B
<missing>      2 weeks ago   /bin/sh -c set -eux;  microdnf install -y "m…   186MB
<missing>      2 weeks ago   /bin/sh -c set -eu;  . /etc/os-release;  {  …   225B
<missing>      2 weeks ago   /bin/sh -c #(nop)  ENV MYSQL_VERSION=8.0.33-…   0B
<missing>      2 weeks ago   /bin/sh -c #(nop)  ENV MYSQL_MAJOR=8.0          0B
<missing>      2 weeks ago   /bin/sh -c set -eux;  key='859BE8D7C586F5384…   3.17kB
<missing>      2 weeks ago   /bin/sh -c set -eux;  microdnf install -y   …   13.6MB
<missing>      2 weeks ago   /bin/sh -c set -eux;  arch="$(uname -m)";  c…   2.36MB
<missing>      2 weeks ago   /bin/sh -c #(nop)  ENV GOSU_VERSION=1.16        0B
<missing>      2 weeks ago   /bin/sh -c set -eux;  groupadd --system --gi…   2.77kB
<missing>      2 weeks ago   /bin/sh -c #(nop)  CMD ["/bin/bash"]            0B
<missing>      2 weeks ago   /bin/sh -c #(nop) ADD file:39d09c6c7c3a0f649…   110MB

C:\Users\fatih>docker image inspect c71276df4a87

C:\Users\fatih>docker image remove c71276df4a87
```