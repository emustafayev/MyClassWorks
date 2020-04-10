package warmup.junitexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreCollectionTest {

    @Test
    void arichmeticMeanTest() {
        //Arrange
        ScoreCollection scoreCollection = new ScoreCollection();
        scoreCollection.add(() -> 5);
        scoreCollection.add(() -> 7);

        //Act
        int i = scoreCollection.arichmeticMean();

        //Assert
        assertEquals(6,i);
    }
}
