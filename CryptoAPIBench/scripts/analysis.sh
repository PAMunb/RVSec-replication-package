#!/bin/bash
sudo Rscript -e "install.packages('pandoc', dep = TRUE)"
sudo Rscript -e "install.packages('rmarkdown', dep = TRUE)"
Rscript -e "rmarkdown::render('analysis-CryptoAPIBench.Rmd')"
