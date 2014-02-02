package nz.co.cyma.integrations.archigitsync.model.impl;

import nz.co.cyma.integrations.archigitsync.model.IVersionModel;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.bolton.archimate.model.IArchimateFactory;
import uk.ac.bolton.archimate.model.IArchimateModel;
import uk.ac.bolton.archimate.model.impl.ArchimateFactory;


/**
 * @author michael
 * Factory class to create a VersionModel object so that the Archi model can be split
 * up into the file objects that are being versioned.
 *
 */
public class VersionFactory {
    public static IVersionModel init(IArchimateModel archiModel) {

        return new VersionModel(archiModel);
    }

 
}
