## 各个模块的作用如下：
- Spring01 简单测试了一下bean.xml（官方名字为：ApplicationContext.xml）
- Spring-autowire 
   - xml配置中的自动注入
   - 使用注解的自动注入
        - @Autowired 
        - @Qualifier
        - @Resource
   
- **IOC的DI（依赖注入）**
   - Spring-constructor 构造器实现依赖注入
   - Spring-set-di set 方法实现依赖注入
- Spring-annotation 使用注解实现Spring配置
    - @Component 还有三个相同功能的（用于mvc架构分层）
        - @Repository
        - @Service
        - @Controller
    - @Value @PropertySource
    - @Scope
    - 自动注入同上**Spring-autowire** 
- Spring-appconfig 使用java实现Spring配置（不需要ApplicationContext.xml文件）
    - @Configuration
    - @Bean
    - @ComponentScan
    - @Import
- proxy 动态代理
    - 基于接口的动态代理原理
    - 基于子类的动态代理原理
- Spring-itheima-aop-xml aop的xml配置，第一次尝试！
    - aop的配置需要新的依赖aspectjweaver，否则报错
    - xml配置的各个步骤及其属性详解
    - 切入点表达式的写法
    
- Spring-aop-xml-advice 五个通知类型详解
- Spring-jdbcTemplate 数据库操作
- ~~itheima-account 无法运行~~ 

