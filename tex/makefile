
.PHONY: all clean

all: requisitos.pdf
clean:
	latexmk -c

%.pdf: %.tex
	latexmk %<

