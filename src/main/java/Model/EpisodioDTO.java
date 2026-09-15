package Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record EpisodioDTO(@JsonAlias("Title") String titulo,
                          @JsonAlias("Episode") int numero,
                          @JsonAlias("Released") String dataLancamento,
                          @JsonAlias("imdbRating") String avaliacao) {
}
