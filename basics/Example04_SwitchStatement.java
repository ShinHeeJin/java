package basics;

// switch 문 학습
// 여러 조건을 효율적으로 처리

public class Example04_SwitchStatement {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        System.out.println("=== 기본 switch 문 ===");
        switch (day) {
            case 1:
                dayName = "월요일";
                break;
            case 2:
                dayName = "화요일";
                break;
            case 3:
                dayName = "수요일";
                break;
            case 4:
                dayName = "목요일";
                break;
            case 5:
                dayName = "금요일";
                break;
            case 6:
                dayName = "토요일";
                break;
            case 7:
                dayName = "일요일";
                break;
            default:
                dayName = "유효하지 않은 날짜";
        }
        System.out.println("요일: " + dayName);

        System.out.println("\n=== fall-through (break 없음) ===");
        int month = 3;
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            default:
                season = "유효하지 않은 월";
        }
        System.out.println("계절: " + season);

        System.out.println("\n=== String으로 switch (Java 7+) ===");
        String fruit = "apple";

        switch (fruit) {
            case "apple":
                System.out.println("빨간 과일입니다");
                break;
            case "banana":
                System.out.println("노란 과일입니다");
                break;
            case "grape":
                System.out.println("보라색 과일입니다");
                break;
            default:
                System.out.println("알 수 없는 과일입니다");
        }

        System.out.println("\n=== switch 표현식 (Java 14+) ===");
        int grade = 2;
        String message = switch (grade) {
            case 1 -> "좋은 성적입니다";
            case 2 -> "평범한 성적입니다";
            case 3 -> "안 좋은 성적입니다";
            default -> "유효하지 않은 성적";
        };
        System.out.println(message);
    }
}
