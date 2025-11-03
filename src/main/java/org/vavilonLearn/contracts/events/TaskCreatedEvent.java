package org.vavilonLearn.contracts.events;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class TaskCreatedEvent implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String eventId;
    private final String taskId;
    private final String creatorId;
    private final String assigneeId;
    private final String title;
    private final String description;
    private final Instant createdAt;

    @JsonCreator
    public TaskCreatedEvent(
            @JsonProperty("eventId") String eventId,
            @JsonProperty("taskId") String taskId,
            @JsonProperty("creatorId") String creatorId,
            @JsonProperty("assigneeId") String assigneeId,
            @JsonProperty("title") String title,
            @JsonProperty("description") String description,
            @JsonProperty("createdAt") Instant createdAt) {
        this.eventId = eventId;
        this.taskId = taskId;
        this.creatorId = creatorId;
        this.assigneeId = assigneeId;
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
    }

    public String getEventId() { return eventId; }
    public String getTaskId() { return taskId; }
    public String getCreatorId() { return creatorId; }
    public String getAssigneeId() { return assigneeId; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public Instant getCreatedAt() { return createdAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskCreatedEvent)) return false;
        TaskCreatedEvent that = (TaskCreatedEvent) o;
        return Objects.equals(eventId, that.eventId) &&
                Objects.equals(taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, taskId);
    }

    @Override
    public String toString() {
        return "TaskCreatedEvent{" +
                "eventId='" + eventId + '\'' +
                ", taskId='" + taskId + '\'' +
                ", creatorId='" + creatorId + '\'' +
                ", assigneeId='" + assigneeId + '\'' +
                ", title='" + title + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
