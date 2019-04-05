/**
 * generated by Xtext 2.16.0
 */
package org.xtext.ui.wizard;

import org.eclipse.xtext.ui.wizard.template.AbstractProjectTemplate;
import org.eclipse.xtext.ui.wizard.template.IProjectTemplateProvider;
import org.xtext.ui.wizard.HelloWorldProject;

/**
 * Create a list with all project templates to be shown in the template new project wizard.
 * 
 * Each template is able to generate one or more projects. Each project can be configured such that any number of files are included.
 */
@SuppressWarnings("all")
public class FLYProjectTemplateProvider implements IProjectTemplateProvider {
  @Override
  public AbstractProjectTemplate[] getProjectTemplates() {
    HelloWorldProject _helloWorldProject = new HelloWorldProject();
    return new AbstractProjectTemplate[] { _helloWorldProject };
  }
}
