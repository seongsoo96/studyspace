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

            Team team = new Team();
            team.setName("teamA");
            em.persist(team);

            Member member = new Member();
            member.setUsername(null);
            member.setAge(10);
            member.setType(MemberType.ADMIN);

            member.setTeam(team);

            em.persist(member);

            em.flush();
            em.clear();

            String query = "select coalesce(m.username, '이름 없는 회원') as username " +
                    "from Member m ";
            List<String> result = em.createQuery(query, String.class)
                    .getResultList();

            for(String s : result) {
                System.out.println("s = " + s);
            }

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

//JPA 서브 쿼리 한계
// - JPA는 WHERE, HAVING 절에서만 서브 쿼리 사용 가능
// - SELECT 절도 가능(하이버네이트에서 지원)
// - FROM 절의 서브 쿼리는 현재 JPQL에서 불가능
//  - 조인으로 풀 수 있으면 풀어서 해결
