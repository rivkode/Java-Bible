package Spring_docs;

import java.io.IOException;

public class RepositoryRank {

    interface GitHubService {
        GitHub connect();
    }

    class DefaultGitHubService implements GitHubService {
        public GitHub connect() {
            return GitHub.connect();
        }
    }

    private GitHubService gitHubService; // 테스트를 만들때 이와 같이 깃헙 서비스를 주입해주면 된다


    /**
     * GitHubService 라는 인터페이스를 활용하여 역할로 구분을 나누어 의존적이지 않게 구현을 하였습니다.
     * 즉 PSA (portable service abstraction)
     * 추상화를 얻는 것
     *
     * 생성자 주입 RepositoryRank 생성자 에서 구현체가 아닌 인터페이스를 주입받으므로써 구현체에 의존하지 않고 역할인 인터페이스에 대해 의존적임 → 의존적이지 않음 → 단위테스트를 하기 용이함
     *
     * 이는 자동차가 바뀌어도 운전자는 동일하게 운전할 수 있는 것과 같은 원리입니다.
     * @param gitHubService
     */
    public RepositoryRank(GitHubService gitHubService) {
        this.gitHubService = gitHubService;
    }

    public int getPoint(String repositoryName) throws IOException {
//        GitHub gitHub = GitHub.connect(); // 주입 전
        GitHub gitHub = gitHubService.connect(); //DI 주입 후
        GHRepository repository = gitHub.getRepository(repositoryName);

        int points = 0;
        if (repository.hasIssues()) {
            points += 1;
        }

        if (repository.getReadme() != null) {
            points += 1;
        }

        if (repository.getPullRequests(GHIssueState.CLOSED).size() > 0) {
            points += 1;
        }

        points += repository.getStargazersCount();
        points += repository.getForksCount();

        return points;
    }

    public static void main(String[] args) throws IOException {
        RepositoryRank spring = new RepositoryRank();
        int point = spring.getPoint(repositoryName: "whiteship/live");
        System.out.println(point);
    }
}
