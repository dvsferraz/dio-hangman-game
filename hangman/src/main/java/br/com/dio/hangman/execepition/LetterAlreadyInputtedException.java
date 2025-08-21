package br.com.dio.hangman.execepition;

public class LetterAlreadyInputtedException extends RuntimeException {
    public LetterAlreadyInputtedException(String message) {
        super(message);
    }
}
