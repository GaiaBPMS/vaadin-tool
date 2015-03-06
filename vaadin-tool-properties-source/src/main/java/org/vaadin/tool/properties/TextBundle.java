package org.vaadin.tool.properties;

/**
 * Interface for a bundle implementation used for obtaining (localized) texts.
 */
public interface TextBundle {
    String getText(String key, Object... params);
}
