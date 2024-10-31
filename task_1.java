@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expected = true;
	assertEquals("Age is equal to or more than 18",expected, isAdult);// Напиши код здесь
}
