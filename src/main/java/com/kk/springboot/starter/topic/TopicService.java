package com.kk.springboot.starter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TopicService {
	List<Topic> topicsDataList = getAllTopicsData();
	
	public List<Topic> getAllTopics() {
		return topicsDataList;
	}

	private List<Topic>  getAllTopicsData() {
		
		//if (asList!=null ) return asList;
		Topic aTopic = new Topic("id1", "name", "desc");
		Topic bTopic = new Topic("id2", "name", "desc");
		Topic cTopic = new Topic("id3", "name", "desc");
		topicsDataList = Arrays.asList(aTopic, bTopic,cTopic);
		System.out.println(topicsDataList );
		return new ArrayList<>(topicsDataList);
	}

	public Topic getTopic(String id) {
		Predicate<? super Topic> p = t -> t.getId().equals(id);
		return getAllTopicsData()
				.stream()
				.filter(p) //fiter to object
				.findFirst()//get first of filer condition
				.get();//get topic
	}

	public void addTopic(Topic t) {
		topicsDataList.add(t);
		System.out.println(topicsDataList);
	}

}
