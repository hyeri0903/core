package hello.core.singleton;

public class SingletonService {

    //static 영역에 하나만 만들어져서 올라감
    private static final SingletonService instance = new SingletonService();

    //자기자신 객체 인스턴스를 만든다. new 인스턴스 생성은 다른데서 못 함!
    //조회할 땐 아래 메서드 사용
    public static SingletonService getInstance() {
        return instance;
    }

    //딱 1개의 객체 인스턴스만 존재해야 하므로, 생성자를 private으로 막아서 외부에서 new 키워드로 객체 인스턴스가 생성되는 것을 막음
    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
