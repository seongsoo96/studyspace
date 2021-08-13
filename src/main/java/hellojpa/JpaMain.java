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

            //엔티티 등록
            Member member1 = new Member(150L, "A");
            Member member2 = new Member(160L, "B");

            em.persist(member1);
            em.persist(member2);
            System.out.println("=========================");

            //엔티티 수정 (변경 감지)
            Member member = em.find(Member.class, 150L);
            member.setName("ZZZZ");
//            em.persist(member);  <- 틀림
            System.out.println("=========================");

            //엔티티 삭제
            Member findMember = em.find(Member.class, 160L);
            em.remove(findMember);
            System.out.println("========================");


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
