package org.reyn.healthfitness.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("1", "Topic1"),
			new Topic("2", "Topic2"),
			new Topic("3", "Topic3")));
	
	public List<Topic> getTopics() {
		return this.topics;
	}
	
	public void addTopic(Topic topic) {
		this.topics.add(topic);
	}
}
