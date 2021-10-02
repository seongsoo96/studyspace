package jpql;

import javax.persistence.*;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member = new Member();
            member.setUsername("member1");
            member.setAge(10);
            em.persist(member);

            //반환 타입이 명확할 때 사용
            TypedQuery<Member> query1 = em.createQuery("select m from Member m", Member.class);
            TypedQuery<String> query2 = em.createQuery("select m.username from Member m", String.class);

            //반환 타입이 명확하지 않을 때 사용
            Query query3 = em.createQuery("select m.username, m.age from Member m");

            List<Member> resultList = query1.getResultList();
            for (Member member1 : resultList) {
                System.out.println("member1 = " + member1);
            }

            //특정 결과가 정확히 하나가 나올 때
            Member result = query1.getSingleResult();
            System.out.println("result = " + result);


            //파라미터 바인딩 - 이름 기준  **위치 기준은 왠만하면 사용 ㄴㄴ
            TypedQuery<Member> query4 = em.createQuery("select m from Member m where m.username = :username", Member.class);
            query4.setParameter("username", "member1");
            Member singleResult = query4.getSingleResult();
            System.out.println("singleResult = " + singleResult.getUsername());


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

        emf.close();
    }
}
