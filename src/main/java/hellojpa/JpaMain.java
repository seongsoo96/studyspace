package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
/*
            //비영속
            Member member = new Member();
            member.setId(101L);
            member.setName("HelloJPA");

            //영속
            System.out.println("=== BEFORE ===");
            em.persist(member);
            System.out.println("=== AFTER ===");

            //1차 캐시에서 조회(select 쿼리문이 안나감)
            Member findMember = em.find(Member.class, 101L);

            System.out.println("findMember.id = " + findMember.getId());
            System.out.println("findMember.name = " + findMember.getName());

            //영속 엔티티의 동일성 보장
            Member findMember1 = em.find(Member.class, 101L);
            Member findMember2 = em.find(Member.class, 101L);

            System.out.println("result = " + (findMember1 == findMember2));
*/


            //플러시
            //  영속성 컨텍스트를 플러하는 방법
            //  em.flush() - 직접 호출
            //  트랜잭션 커밋 - 플러시 자동 호출
            //  JPQL쿼리 실행 - 플러시 자동 호출
            //  플러시는
            //  영속성 컨텍스트를 비우지 않음
            //  영속성 컨텍스트의 변경내용을 데이터베이스에 동기화
            //  트랜잭션이라는 작업 단위가 중요! -> 커밋 직전에만 동기화 하면 됨.
            Member member200 = new Member(200L, "member200");
            em.persist(member200);

            em.flush();
            System.out.println("=========================");


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
