import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import entity.pojo.Comment;
import entity.pojo.Feed;
import entity.pojo.User;
import entity.util.HibernateUtil;

public class Test1 {

	@Test
	public void testForum() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		User user = new User();
		user.setUserId("123456");
		user.setEmail("zs@gmail.com");
		user.setPassword("zubair");

		Feed feed = new Feed();
		feed.setFeedId(1);
		feed.setCommentDate(new Date());
		feed.setQuestion("What is a process");

		Comment comment = new Comment();
		comment.setFeed(feed);
		comment.setUser(user);
		comment.setCommId(12);

		session.save(user);
		tx.commit();

	}

}
