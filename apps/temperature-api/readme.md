
```bash

cd C:\h\a\f\software-architect-cource\labs\sprint-1\architecture-warmhouse\apps\temperature-api
cd /c/h/a/f/architecture-warmhouse/apps/temperature-api


# собрать образ
docker build -t temperature-api-img .
docker build -t smarthome-app-img .

# контейнеры
docker ps
docker ps -a

# запустить контейнер
docker run --publish 8081:8081 --name temperature-api-ct temperature-api-img
docker run -d -p 8081:8081 --name temperature-api-ct temperature-api-img
```
