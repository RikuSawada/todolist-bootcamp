# todolist-bootcamp

このプロジェクトは Spring Boot と PostgreSQL を Docker Compose で動作させるサンプルです。

## Docker の操作方法

### ビルドして起動
```
docker compose up -d --build
```

### コンテナの状態を確認
```
docker compose ps
```

### コンテナ内でシェルを起動
サービス名を利用する場合:
```
docker compose exec app /bin/bash
```
コンテナ名を直接指定する場合:
```
docker exec -it todolist-bootcamp-app-1 /bin/bash
```

### ログを追跡
```
docker logs -f todolist-bootcamp-app-1
```
または
```
docker compose logs -f app
```

### コンテナの停止と削除
```
docker compose down
```

### その他便利なコマンド
既存コンテナを停止のみする:
```
docker compose stop
```
再起動する:
```
docker compose restart
```
