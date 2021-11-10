

# Terraform


Terraform is an open-source tool for infrastructure provisioning, it allows you to manage and automate your infrastructure or services. Traditionally you would need to set up the infrastructure manually such as networking, server instances, other tools such as docker and security. Once the infrastructure is provisioned the deployment application can be deployed on the infrastructure. Terraform is used for the provision of the infrastructure the jobs that terraform can do is create a VPC, start-up instances of servers, create edit or remove user and permissions,  install additional tooling and deploy applications. Terraform is considered infrastructure as code (IOC), which is a relatively new automation tool that can allow teams to easily change their infrastructure configurations or replicate that infrastructure. The team can replicate the developed infrastructure configuration to production so that it would reduce any compatibility problems. The architecture of Terraform is made up of two components core and state. In the core, it analyses the TF-Config file and checks what needs to be created destroyed or updated. The state is the current position of the infrastructure and figures out what path it needs to take to get the newly required state. Terraform can work on Ifrastrucutre as a service (IaaS) such as AWS, Azure and GCP.



## Useful Terraform Resources 

1. [Introduction to Terraform](https://www.terraform.io/intro/index.html)
2. [Terraform Tuturials - Get Started AWS](https://learn.hashicorp.com/tutorials/terraform/infrastructure-as-code?in=terraform/aws-get-started)
3. [Download Terraform](https://www.terraform.io/downloads.html)


# Docker

Docker is also an open-source tool used to make the development of applications much easier, the application is contained along with all the configuration and dependencies inside a container. The container can be easily shared around across different development environments, which makes the development of an application much more efficient. Before the inception of Docker containers, the steps to develop an application in different elements would yield a different install process and there would be a lot of steps involved which could lead to a higher chance of something going wrong. Docker address this issue by encapsulating the development environment inside a container. When there are multiple versions of a container running on a single machine, each docker container is sandboxed for each other as if they were running on different physical machines. What drove the rise of Docker was the requirement for reliability, scalability, security and reachability. 
A container repository is a place where containers are stored a popular site called DockerHub is where you can download docker containers such as [nodejs](https://hub.docker.com/_/node), [ubuntu](https://hub.docker.com/_/ubuntu), [PostGres](https://hub.docker.com/_/postgres), [mysql](https://hub.docker.com/_/mysql) and [openJDK](https://hub.docker.com/_/openjdk).

## Useful Docker Resources 

1. [Get Started with Docker](https://www.docker.com/get-started)
2. [Docker Dev Docs](https://docs.docker.com/)
3. [Download Docker](https://docs.docker.com/get-docker/)





















