package io.jb.topic;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class TopicService {

	private List<Topic> topics= new ArrayList<>(Arrays.asList(
			new Topic("spring","spring framework","spring framework description"),
			new Topic("spring1","spring framework1","spring framework description2"),
			new Topic("spring2","spring framework3","spring framework description4")
			));
	public List<Topic> getTo(){
		return topics;
	}
	public Topic getTos(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void addTop(Topic tope) {
		topics.add(tope);
	}
	}
