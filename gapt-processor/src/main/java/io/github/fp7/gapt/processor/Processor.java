package io.github.fp7.gapt.processor;

import clojure.lang.IPersistentMap;
import clojure.lang.RT;
import com.google.auto.service.AutoService;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

@AutoService(javax.annotation.processing.Processor.class)
public class Processor extends AbstractProcessor {

  @Override
  public Set<String> getSupportedAnnotationTypes() {
    return Stream.of(Test.class.getName()).collect(Collectors.toSet());
  }

  @Override
  public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
    IPersistentMap map = RT.map();

    return false;
  }

  @Override
  public SourceVersion getSupportedSourceVersion() {
    return SourceVersion.RELEASE_8;
  }

}
