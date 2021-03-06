package neo4j.domain;

import org.neo4j.ogm.annotation.*;

import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

@JsonIdentityInfo(generator=JSOGGenerator.class)

@NodeEntity
public class Paper {
    @GraphId 
    Long id;

    String title;

    @Relationship(type="PUBLISH", direction = Relationship.INCOMING) List<Publication> publications;

    public Paper() { }

    public String getTitle() {
        return title;
    }

    public Collection<Publication> getPublications() {
        return publications;
    }
}

