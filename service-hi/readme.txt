服务提供者 (eureka client) ：
当client向server注册时，它会提供一些元数据，例如主机和端口，URL，主页等。Eureka server 从每个client实例接收心跳消息。 如果心跳超时，则通常将该实例从注册server中删除。

访问：
http://192.168.1.5:8762/hi?name=AA%E6%97%B6