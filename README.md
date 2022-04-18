1. May JHipster anonymously report usage statistics to improve the
tool over time? (Y/n) → **Y**
    
    : JHipster는 개선을 위해 사용 통계를 익명으로 보고할 수 있습니다. 시간이 지남에 따라 구?
    
2. Which *type* of application would you like to create? (Use arrow keys)
    
    Monolithic application (recommended for simple projects) : 모놀리식 애플리케이션 ( 단순 프로젝트에 권장)
    **Microservice application : ( 마이크로 서비스 애플리케이션 )**
    Microservice gateway : ( 마이크로서비스 게이트 웨이 )  
    JHipster UAA server (for microservice OAuth2 authentication) : JHipster UAA 서버(마이크로서비스 OAuth2 인증용)
    
3. What is the base name of your application? : 애플리케이션의 기본 이름은 무엇입니까? **first_jHipster**
4. What is your default Java package name? (com.mycompany.myapp) **com.jhipster.app**
5. Do you want to use the JHipster Registry to configure, monitor and scale your application? (Use arrow keys) : JHipster Registry를 사용하여 애플리케이션을 구성, 모니터링 및 확장하시겠습니까? (화살표 키 사용)
    
    No
    **Yes**
    
6. Which *type* of database would you like to use? (Use arrow keys) : 어떤 유형의 데이터베이스를 사용하시겠습니까?

> **SQL (H2, MySQL, MariaDB, PostgreSQL, Oracle, MSSQL)**
MongoDB
Cassandra
Couchbase
No database
> 
1. Which *production* database would you like to use? (Use arrow keys) : 어떤 *프로덕션* 데이터베이스를 사용하시겠습니까? (화살표 키 사용)
    
    **MySQL**
    MariaDB
    PostgreSQL
    Oracle (Please follow our documentation to use the Oracle proprietary driver)
    Microsoft SQL Server
    
2. Which *development* database would you like to use? (Use arrow keys) : 어떤 *개발* 데이터베이스를 사용하시겠습니까? (화살표 키 사용)
    
    **H2 with disk-based persistence**
    H2 with in-memory persistence
    MySQL
    
3. Do you want to use the Spring cache abstraction? (Use arrow keys) : Spring 캐시 추상화를 사용하시겠습니까? (화살표 키 사용)
    
    Yes, with the Ehcache implementation (local cache, for a single node) : 예, Ehcache 구현(단일 노드의 경우 로컬 캐시)
    **Yes, with the Hazelcast implementation (distributed cache, for multiple nodes, supports rate-limiting for gateway applications) : 예, Hazelcast 구현(분산 캐시, 다중 노드용, 게이트웨이 애플리케이션에 대한 속도 제한 지원)**
    [BETA] Yes, with the Infinispan implementation (hybrid cache, for multiple nodes) : ****[베타] 예, Infinispan 구현(하이브리드 캐시, 다중 노드용)
    Yes, with Memcached (distributed cache) - Warning, when using an SQL database, this will disable the Hibernate 2nd level cache! : 예, Memcached(분산 캐시) 사용 - 경고, SQL 데이터베이스를 사용할 때 Hibernate 2차 수준 캐시가 비활성화됩니다!
    No - Warning, when using an SQL database, this will disable the Hibernate 2nd level cache! : 아니오 - 경고, SQL 데이터베이스를 사용할 때 이것은 Hibernate 2nd 레벨 캐시를 비활성화할 것입니다!
    
4. Do you want to use Hibernate 2nd level cache? (Y/n) : Hibernate 2nd 레벨 캐시를 사용하시겠습니까? **n**
5. Would you like to use Maven or Gradle for building the backend? : **백엔드 구축을 위해 Maven 또는 Gradle을 사용하시겠습니까?**
Maven
    
    **Gradle**
    
6. Which other technologies would you like to use? (Press <space> to select, <a> to toggle all, <i> to invert selection) : 어떤 다른 기술을 사용하고 싶습니까? (선택하려면 <space>를 누르고, 모두 토글하려면 <a>를 누르고, 선택을 반전하려면 <i>를 누르십시오.)
    
    > **(*) Search engine using Elasticsearch : Elasticsearch를 이용한 검색 엔진
    (*) WebSockets using Spring Websocket : Spring Websocket을 사용하는 WebSockets
    (*) Asynchronous messages using Apache Kafka : Apache Kafka를 사용한 비동기 메시지
    (*) API first development using OpenAPI-generator : OpenAPI-generator를 사용한 API 최초 개발**
    > 
7. Which *Framework* would you like to use for the client? (Use arrow keys)
    
    : 클라이언트에 어떤 프레임워크를 사용하시겠습니까? (화살표 키 사용)
    
    Angular
    **React**
    No client
    
8. Would you like to use a Bootswatch theme (https://bootswatch.com/)? (Use arrow keys)
    
    : **Bootswatch 테마(https://bootswatch.com/)를 사용하시겠습니까? (화살표 키 사용)**
    
    **Default JHipster : **기본 JHipster****
    Cerulean : 세룰리안
    Cosmo : 코스모
    Cyborg : 사이보그
    Darkly : 어둡게
    Flatly : 단조롭게
    Journal : 신문
    
    Litera : 리터라
    Lumen : 루멘
    
    Lux : 럭스
    Materia : 물질
    Minty :민티
    Pulse : 맥박
    
    Sandstone : 사암
    Simplex : 심플렉스
    
    Sketchy : 스케치
    Slate : 슬레이트
    Solar : 태양열
    Spacelab : 우주실험실
    
    Superhero : 슈퍼히어로
    United : 유나이티드
    
    Yeti : 예티
    
    (Move up and down to reveal more choices)
    
9. Would you like to enable internationalization support? (Y/n) : 국제화 지원을 활성화하시겠습니까? **Y**
10. Please choose the native language of the application (Use arrow keys) : 응용 프로그램의 모국어를 선택하십시오(화살표 키 사용).
    
    **English**
    
11. Please choose additional languages to install (Press <space> to select, <a> to toggle all, <i> to invert selection) : 설치할 추가 언어를 선택하십시오
    
    **Korean**
    
12. Besides JUnit and Jest, which testing frameworks would you like to use? (Press <space> to select, <a> to toggle all, <i> to invert selection) : ****JUnit과 Jest 외에 어떤 테스트 프레임워크를 사용하고 싶으신가요?
    
    **(*) Gatling
    (*) Cucumber
    (*) Protractor**
    
13. Would you like to install other generators from the JHipster Marketplace? (y/N) : JHipster Marketplace에서 다른 생성기를 설치하시겠습니까? (예/아니요) **No**

14. Would you like to use a Bootswatch theme (https://bootswatch.com/)? (Use arrow keys)
    
    : **Bootswatch 테마(https://bootswatch.com/)를 사용하시겠습니까? (화살표 키 사용)**
    
    **Default JHipster : **기본 JHipster****
    Cerulean : 세룰리안
    Cosmo : 코스모
    Cyborg : 사이보그
    Darkly : 어둡게
    Flatly : 단조롭게
    Journal : 신문
    
    Litera : 리터라
    Lumen : 루멘
    
    Lux : 럭스
    Materia : 물질
    Minty :민티
    Pulse : 맥박
    
    Sandstone : 사암
    Simplex : 심플렉스
    
    Sketchy : 스케치
    Slate : 슬레이트
    Solar : 태양열
    Spacelab : 우주실험실
    
    Superhero : 슈퍼히어로
    United : 유나이티드
    
    Yeti : 예티
    
    (Move up and down to reveal more choices)


15. Would you like to enable internationalization support? (Y/n) : 국제화 지원을 활성화하시겠습니까? **Y**
16. Please choose the native language of the application (Use arrow keys) : 응용 프로그램의 모국어를 선택하십시오(화살표 키 사용).
    
    **English**
    
17. Please choose additional languages to install (Press <space> to select, <a> to toggle all, <i> to invert selection) : 설치할 추가 언어를 선택하십시오
    
    **Korean**
    
18. Besides JUnit and Jest, which testing frameworks would you like to use? (Press <space> to select, <a> to toggle all, <i> to invert selection) : ****JUnit과 Jest 외에 어떤 테스트 프레임워크를 사용하고 싶으신가요?
    
    **(*) Gatling
    (*) Cucumber
    (*) Protractor**
    
19. Would you like to install other generators from the JHipster Marketplace? (y/N) : JHipster Marketplace에서 다른 생성기를 설치하시겠습니까? (예/아니요) **No**






# first_jHipster

This application was generated using JHipster 6.1.2, you can find documentation and help at [https://www.jhipster.tech/documentation-archive/v6.1.2](https://www.jhipster.tech/documentation-archive/v6.1.2).

## Development

Before you can build this project, you must install and configure the following dependencies on your machine:

1. [Node.js][]: We use Node to run a development web server and build the project.
   Depending on your system, you can install Node either from source or as a pre-packaged bundle.

After installing Node, you should be able to run the following command to install development tools.
You will only need to run this command when dependencies change in [package.json](package.json).

    npm install

We use npm scripts and [Webpack][] as our build system.

Run the following commands in two separate terminals to create a blissful development experience where your browser
auto-refreshes when files change on your hard drive.

    ./gradlew
    npm start

Npm is also used to manage CSS and JavaScript dependencies used in this application. You can upgrade dependencies by
specifying a newer version in [package.json](package.json). You can also run `npm update` and `npm install` to manage dependencies.
Add the `help` flag on any command to see how you can use it. For example, `npm help update`.

The `npm run` command will list all of the scripts available to run for this project.

### Service workers

Service workers are commented by default, to enable them please uncomment the following code.

- The service worker registering script in index.html

```html
<script>
  if ('serviceWorker' in navigator) {
    navigator.serviceWorker.register('./service-worker.js').then(function() {
      console.log('Service Worker Registered');
    });
  }
</script>
```

Note: workbox creates the respective service worker and dynamically generate the `service-worker.js`

### Managing dependencies

For example, to add [Leaflet][] library as a runtime dependency of your application, you would run following command:

    npm install --save --save-exact leaflet

To benefit from TypeScript type definitions from [DefinitelyTyped][] repository in development, you would run following command:

    npm install --save-dev --save-exact @types/leaflet

Then you would import the JS and CSS files specified in library's installation instructions so that [Webpack][] knows about them:
Note: there are still few other things remaining to do for Leaflet that we won't detail here.

For further instructions on how to develop with JHipster, have a look at [Using JHipster in development][].

### Doing API-First development using openapi-generator

[OpenAPI-Generator]() is configured for this application. You can generate API code from the `src/main/resources/swagger/api.yml` definition file by running:

```bash
./gradlew openApiGenerate
```

Then implements the generated delegate classes with `@Service` classes.

To edit the `api.yml` definition file, you can use a tool such as [Swagger-Editor](). Start a local instance of the swagger-editor using docker by running: `docker-compose -f src/main/docker/swagger-editor.yml up -d`. The editor will then be reachable at [http://localhost:7742](http://localhost:7742).

Refer to [Doing API-First development][] for more details.

## Building for production

### Packaging as jar

To build the final jar and optimize the first_jHipster application for production, run:

    ./gradlew -Pprod clean bootJar

This will concatenate and minify the client CSS and JavaScript files. It will also modify `index.html` so it references these new files.
To ensure everything worked, run:

    java -jar build/libs/*.jar

Then navigate to [http://localhost:8080](http://localhost:8080) in your browser.

Refer to [Using JHipster in production][] for more details.

### Packaging as war

To package your application as a war in order to deploy it to an application server, run:

    ./gradlew -Pprod -Pwar clean bootWar

## Testing

To launch your application's tests, run:

    ./gradlew test integrationTest

### Client tests

Unit tests are run by [Jest][] and written with [Jasmine][]. They're located in [src/test/javascript/](src/test/javascript/) and can be run with:

    npm test

For more information, refer to the [Running tests page][].

### Code quality

Sonar is used to analyse code quality. You can start a local Sonar server (accessible on http://localhost:9001) with:

```
docker-compose -f src/main/docker/sonar.yml up -d
```

You can run a Sonar analysis with using the [sonar-scanner](https://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner) or by using the gradle plugin.

Then, run a Sonar analysis:

```
./gradlew -Pprod clean check sonarqube
```

For more information, refer to the [Code quality page][].

## Using Docker to simplify development (optional)

You can use Docker to improve your JHipster development experience. A number of docker-compose configuration are available in the [src/main/docker](src/main/docker) folder to launch required third party services.

For example, to start a mysql database in a docker container, run:

    docker-compose -f src/main/docker/mysql.yml up -d

To stop it and remove the container, run:

    docker-compose -f src/main/docker/mysql.yml down

You can also fully dockerize your application and all the services that it depends on.
To achieve this, first build a docker image of your app by running:

    ./gradlew bootJar -Pprod jibDockerBuild

Then run:

    docker-compose -f src/main/docker/app.yml up -d

For more information refer to [Using Docker and Docker-Compose][], this page also contains information on the docker-compose sub-generator (`jhipster docker-compose`), which is able to generate docker configurations for one or several JHipster applications.

## Continuous Integration (optional)

To configure CI for your project, run the ci-cd sub-generator (`jhipster ci-cd`), this will let you generate configuration files for a number of Continuous Integration systems. Consult the [Setting up Continuous Integration][] page for more information.

[jhipster homepage and latest documentation]: https://www.jhipster.tech
[jhipster 6.1.2 archive]: https://www.jhipster.tech/documentation-archive/v6.1.2
[using jhipster in development]: https://www.jhipster.tech/documentation-archive/v6.1.2/development/
[service discovery and configuration with the jhipster-registry]: https://www.jhipster.tech/documentation-archive/v6.1.2/microservices-architecture/#jhipster-registry
[using docker and docker-compose]: https://www.jhipster.tech/documentation-archive/v6.1.2/docker-compose
[using jhipster in production]: https://www.jhipster.tech/documentation-archive/v6.1.2/production/
[running tests page]: https://www.jhipster.tech/documentation-archive/v6.1.2/running-tests/
[code quality page]: https://www.jhipster.tech/documentation-archive/v6.1.2/code-quality/
[setting up continuous integration]: https://www.jhipster.tech/documentation-archive/v6.1.2/setting-up-ci/
[node.js]: https://nodejs.org/
[yarn]: https://yarnpkg.org/
[webpack]: https://webpack.github.io/
[angular cli]: https://cli.angular.io/
[browsersync]: http://www.browsersync.io/
[jest]: https://facebook.github.io/jest/
[jasmine]: http://jasmine.github.io/2.0/introduction.html
[protractor]: https://angular.github.io/protractor/
[leaflet]: http://leafletjs.com/
[definitelytyped]: http://definitelytyped.org/
[openapi-generator]: https://openapi-generator.tech
[swagger-editor]: http://editor.swagger.io
[doing api-first development]: https://www.jhipster.tech/documentation-archive/v6.1.2/doing-api-first-development/
