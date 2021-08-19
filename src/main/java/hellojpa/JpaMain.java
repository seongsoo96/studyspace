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
            양방향 매핑시 가장 많이 하는 실수

            Team team = new Team();
            team.setName("TeamA");
            em.persist(team);

            Member member = new Member();
            member.setUsername("member1");

            //역방향(주인이 아닌 방향)만 연관관계 설정
            team.getMembers().add(member);

            em.persist(member);
*/

            //저장
            Team team = new Team();
            team.setName("TeamA");

            em.persist(team);

            Member member = new Member();
            member.setUsername("member1");
            //양방향 매핑시 연관관계의 주인에 값을 입력해야 한다.
            member.changeTeam(team);

            em.persist(member);

            team.addMember(member);

            //순수한 객체 관계를 고려하면 항상 양쪽다 값을 입력해야 한다
            //까먹을수도 있으니 미리 setter에 설정을 해준다
//            team.getMembers().add(member);

//            em.flush();
//            em.clear();

            Team findTeam = em.find(Team.class, team.getId()); //1차 캐시
            List<Member> members = findTeam.getMembers();

            System.out.println("============");
            System.out.println("members = " + findTeam);
            System.out.println("============");

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
