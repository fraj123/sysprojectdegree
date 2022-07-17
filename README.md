# sysprojectdegree
Project Degree Monitoring System

## System Architecture
```mermaid
graph LR;
    projerctDb[(projerctDb)];
    projerctDb-->Backend;
    Backend-->Frontend;
```
## Create DB container
```
docker-composer up -d
```
## Enter to DB Container
```
docker exec -it sysprojectdegree bash
```
## Enter to DB
```
# mysql -u root -p
```
Pass:`6?+Kf_Z2YFU9wGa-Yn2T`

