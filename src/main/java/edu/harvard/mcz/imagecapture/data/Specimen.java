package edu.harvard.mcz.imagecapture.data;

// Generated Jan 23, 2009 8:12:35 AM by Hibernate Tools 3.2.2.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.harvard.mcz.imagecapture.ImageCaptureProperties;
import edu.harvard.mcz.imagecapture.Singleton;
import edu.harvard.mcz.imagecapture.exceptions.SaveFailedException;

/**
 * Specimen generated by hbm2java
 */
public class Specimen implements java.io.Serializable {
	
	private static final Log log = LogFactory.getLog(Specimen.class);

	private static final long serialVersionUID = -1321141594439433313L;
	
	public static final String STATUS_NOT_A_TYPE = "Not a Type";
	
	private Long specimenId;
	private String barcode;
	private String drawerNumber;
	private String typeStatus; // Types only
	private Long typeNumber;   // Types only, raw number for crosscheck
	private String citedInPublication; // (title) Types only
	//private String citedInPublicationPage;  // Types only
	//private String citedInPublicationYear;  // Types only
	private String features;
	private String family;
	private String subfamily;
	private String tribe;
	private String genus;
	private String specificEpithet;
	private String subspecificEpithet;
	private String infraspecificEpithet;
	private String infraspecificRank;
	private String authorship;
	private String unNamedForm;
	//private String identificationQualifier;
	private String identifiedBy;
	
	private String natureOfId;
	private String dateIdentified;
	private String identificationRemarks;
	
	private String higherGeography;
	private String country;
	private String primaryDivison;
	private String specificLocality;
	private String verbatimLocality;
	private String verbatimCollector;
	private String verbatimCollection;
	private String verbatimNumbers;
	private String verbatimUnclassifiedText;

	private String verbatimClusterIdentifier;
	private String externalWorkflowProcess;
	private Date externalWorkflowDate;
	// private String verbatimElevation;   // removed

	private Long minimum_elevation;
	private Long maximum_elevation;
	private String elev_units;
	private String collectingMethod;
	private String isoDate;
	private String dateNos;
	private String dateEmerged;
	private String dateEmergedIndicator;
	private String dateCollected;
	private String dateCollectedIndicator;
	private String collection;
	private String specimenNotes;
	private String lifeStage;
	private String sex;
	// private String preparationType;  
	private String habitat;
	private String microhabitat;
	private String associatedTaxon;
	private String questions;
	private String inferences;
	private String locationInCollection;
	private String workFlowStatus;
	private String createdBy;
	private Date dateCreated;
	private Date dateLastUpdated;
	private String lastUpdatedBy;
	private Boolean validDistributionFlag;
	private Boolean flagInBulkloader;
	private Boolean flagInMCZbase;
	private Boolean flagAncilaryAlsoInMCZbase;
	private String creatingPath;   // A path for image file, denormalized from Image.path for JPA query without join to Image. 
	private String creatingFilename;
	private Set<Collector> collectors = new HashSet<Collector>(0);
	private Set<Determination> determinations = new HashSet<Determination>(0);
	private Set<Tracking> trackings = new HashSet<Tracking>(0);
	private Set<Number> numbers = new HashSet<Number>(0);
	private Set<ICImage> ICImages = new HashSet<ICImage>(0);
	private Set<SpecimenPart> specimenParts = new HashSet<SpecimenPart>(0);
	private Set<LatLong> georeferences = new HashSet<LatLong>(0);
	private Set<ExternalHistory> externalHistory = new HashSet<ExternalHistory>(0);
	private Long locality_id;
	private Long collecting_event_id;
	
	public Specimen() {
		setDefaults();
	}

	/** Set default values for a new specimen object with no other data.
	 * 
	 */
	public final void setDefaults() { 
		// NOTE: Any default set here should also be cleared in clearDefaults 
		// or searches by example may not return expected results.
		this.typeStatus = STATUS_NOT_A_TYPE;
		this.validDistributionFlag = true;
		this.flagInBulkloader = false;
		this.flagInMCZbase = false;
		this.flagAncilaryAlsoInMCZbase = false;
		//this.preparationType = "Pinned";
		this.natureOfId = NatureOfId.LEGACY;
		/* 
		if (this.verbatimCollection==null) { this.verbatimCollection = ""; }
		if (this.verbatimCollector==null) { this.verbatimCollector = ""; }
		if (this.verbatimLocality==null) { this.verbatimLocality = ""; }
		if (this.verbatimNumbers==null) { this.verbatimNumbers = ""; }
		if (this.verbatimUnclassifiedText==null) { this.verbatimUnclassifiedText = ""; }
		*/
	}
	
	/** Clear the default values for a new specimen object, as in one that
	 * is to be used as the search criteria for a search by pattern.
	 */
	public void clearDefaults() { 
		// Note: these could also be ignored in SpecimenLifeCycle.findByExampleLike().
		this.typeStatus = null;
		this.validDistributionFlag = null;
		this.flagInBulkloader = null;
		this.flagInMCZbase = null;
		this.flagAncilaryAlsoInMCZbase = null;		
		//this.preparationType = null;
		this.natureOfId = null;
	}
	
	public Specimen(String barcode, String typeStatus, Date dateCreated) {
		this.validDistributionFlag = true;
		this.barcode = barcode;
		this.typeStatus = typeStatus;
		if (dateCreated==null) { 
			this.dateCreated = null;
		} else { 
		    this.dateCreated = (Date) dateCreated.clone();
		}
	}

	public Specimen(String barcode, String drawerNumber, String typeStatus,
			Long typeNumber, String citedInPublication, String features,
			String family, String subfamily, String tribe, String genus,
			String specificEpithet, String subspecificEpithet,
			String infraspecificEpithet, String infraspecificRank,
			String authorship, String unNamedForm,
			String identificationQualifier, String identifiedBy,
			String country, String primaryDivison, String specificLocality,
			String verbatimLocality,
			Long minimum_elevation, Long maximum_elevation, String elev_units,
			String collectingMethod, String dateNos, String dateEmerged,
			String dateEmergedIndicator, String dateCollected,
			String dateCollectedIndicator, String collection,
			String specimenNotes, String lifeStage, String preparationType,
			String sex, String microhabitat,
			String habitat, String associatedTaxon, String questions,
			String inferences, String locationInCollection,
			String workFlowStatus, String createdBy, Date dateCreated,
			Date dateLastUpdated, String lastUpdatedBy,
			Boolean validDistributionFlag, Set<Collector> collectors,
			Set<Determination> determinations, Set<Tracking> trackings,
			Set<Number> numbers, Set<ICImage> ICImages, 
	        Set<SpecimenPart>specimenParts ) {
		this.barcode = barcode;
		this.drawerNumber = drawerNumber;
		this.typeStatus = typeStatus;
		this.typeNumber = typeNumber;
		this.citedInPublication = citedInPublication;
		this.features = features;
		setFamily(family);
		this.subfamily = subfamily;
		this.tribe = tribe;
		this.genus = genus;
		this.specificEpithet = specificEpithet;
		this.subspecificEpithet = subspecificEpithet;
		this.infraspecificEpithet = infraspecificEpithet;
		this.infraspecificRank = infraspecificRank;
		this.authorship = authorship;
		this.unNamedForm = unNamedForm;
		this.identifiedBy = identifiedBy;
		this.country = country;
		this.primaryDivison = primaryDivison;
		this.specificLocality = specificLocality;
		this.verbatimLocality = verbatimLocality;
		//this.verbatimElevation = verbatimElevation;
		this.minimum_elevation = minimum_elevation;
		this.maximum_elevation = maximum_elevation;
		this.elev_units = elev_units;
		this.collectingMethod = collectingMethod;
		this.dateNos = dateNos;
		this.dateEmerged = dateEmerged;
		this.dateEmergedIndicator = dateEmergedIndicator;
		this.dateCollected = dateCollected;
		this.dateCollectedIndicator = dateCollectedIndicator;
		this.collection = collection;
		this.specimenNotes = specimenNotes;
		this.lifeStage = lifeStage;
		this.sex = sex;
		//this.preparationType = preparationType;
		this.habitat = habitat;
		this.microhabitat = microhabitat;
		this.associatedTaxon = associatedTaxon;
		this.questions = questions;
		this.inferences = inferences;
		this.locationInCollection = locationInCollection;
		this.workFlowStatus = workFlowStatus;
		this.createdBy = createdBy;
		if (dateCreated==null) { 
			this.dateCreated = null;
		} else { 
		   this.dateCreated = (Date) dateCreated.clone();
		}
		if (dateLastUpdated==null) { 
			this.dateLastUpdated = null;
		} else {  
		    this.dateLastUpdated = (Date) dateLastUpdated.clone();
	    }
		this.lastUpdatedBy = lastUpdatedBy;
		this.validDistributionFlag = validDistributionFlag;
		this.collectors = collectors;
		this.determinations = determinations;
		this.trackings = trackings;
		this.numbers = numbers;
		this.ICImages = ICImages;
		this.specimenParts = specimenParts;
	}

	public Long getSpecimenId() {
		return this.specimenId;
	}

	public void setSpecimenId(Long specimenId) {
		this.specimenId = specimenId;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	/**
	 * non-zero padded catalog number extracted from the barcode, equivalent to 
	 * arctos/MCZbase cat_num for lepidoptera.
	 * 
	 * @return numeric part of barcode without zero padding
	 */
    public String getCatNum() {
		return Integer.toString(Integer.parseInt(barcode.substring(8, barcode.length())));
	}	

	public String getDrawerNumber() {
		return this.drawerNumber;
	}

	public void setDrawerNumber(String drawerNumber) {
		this.drawerNumber = drawerNumber;
	    if (this.drawerNumber!=null && this.drawerNumber.length() > MetadataRetriever.getFieldLength(Specimen.class, "DrawerNumber")) { 
	        this.drawerNumber = this.drawerNumber.substring(0, MetadataRetriever.getFieldLength(Specimen.class, "DrawerNumber")); 
	    }
	}

	public String getTypeStatus() {
		return this.typeStatus;
	}

	public void setTypeStatus(String typeStatus) {
		this.typeStatus = typeStatus;
	}

	public Long getTypeNumber() {
		return this.typeNumber;
	}

	public void setTypeNumber(Long typeNumber) {
		this.typeNumber = typeNumber;
	}

	public String getCitedInPublication() {
		return this.citedInPublication;
	}

	public void setCitedInPublication(String citedInPublication) {
		this.citedInPublication = citedInPublication;
	}

	public String getFeatures() {
		return this.features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public String getFamily() {
		return this.family;
	}

	public void setFamily(String family) {
	    this.family = family;
	    if (this.family!=null && this.family.length() > MetadataRetriever.getFieldLength(Specimen.class, "Family")) { 
	        this.family = this.family.substring(0, MetadataRetriever.getFieldLength(Specimen.class, "Family")); 
	    }
	    if (this.family!=null) { 
	    	this.family = this.family.trim();
	    }
	}

	public String getSubfamily() {
		return this.subfamily;
	}

	public void setSubfamily(String subfamily) {
		this.subfamily = subfamily;
	    if (this.subfamily!=null) { 
	    	this.subfamily = this.subfamily.trim();
	    }
	}

	public String getTribe() {
		return this.tribe;
	}

	public void setTribe(String tribe) {
		this.tribe = tribe;
	    if (this.tribe!=null) { 
	    	this.tribe = this.tribe.trim();
	    }
	}

	public String getGenus() {
		return this.genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	    if (this.genus!=null) { 
	    	this.genus = this.genus.trim();
	    }
	}

	public String getSpecificEpithet() {
		return this.specificEpithet;
	}

	public void setSpecificEpithet(String specificEpithet) {
		this.specificEpithet = specificEpithet;
	    if (this.specificEpithet!=null) { 
	    	this.specificEpithet = this.specificEpithet.trim();
	    }
	}

	public String getSubspecificEpithet() {
		return this.subspecificEpithet;
	}

	public void setSubspecificEpithet(String subspecificEpithet) {
		this.subspecificEpithet = subspecificEpithet;
	    if (this.subspecificEpithet!=null) { 
	    	this.subspecificEpithet = this.subspecificEpithet.trim();
	    }
	}

	public String getInfraspecificEpithet() {
		return this.infraspecificEpithet;
	}

	public void setInfraspecificEpithet(String infraspecificEpithet) {
		this.infraspecificEpithet = infraspecificEpithet;
	    if (this.infraspecificEpithet!=null) { 
	    	this.infraspecificEpithet = this.infraspecificEpithet.trim();
	    }
	}

	public String getInfraspecificRank() {
		return this.infraspecificRank;
	}

	public void setInfraspecificRank(String infraspecificRank) {
		this.infraspecificRank = infraspecificRank;
	    if (this.infraspecificRank!=null) { 
	    	this.infraspecificRank = this.infraspecificRank.trim();
	    }
	}

	public String getAuthorship() {
		return this.authorship;
	}

	public void setAuthorship(String authorship) {
		this.authorship = authorship;
	    if (this.authorship!=null) { 
	    	this.authorship = this.authorship.trim();
	    }
	}

	public String getUnNamedForm() {
		return this.unNamedForm;
	}

	public void setUnNamedForm(String unNamedForm) {
		this.unNamedForm = unNamedForm;
	    if (this.unNamedForm!=null) { 
	    	this.unNamedForm = this.unNamedForm.trim();
	    }
	}


	public String getIdentifiedBy() {
		return this.identifiedBy;
	}

	public void setIdentifiedBy(String identifiedBy) {
		this.identifiedBy = identifiedBy;
	}

	/**
	 * @return the natureOfId
	 */
	public String getNatureOfId() {
		return natureOfId;
	}

	/**
	 * @param natureOfId the natureOfId to set
	 */
	public void setNatureOfId(String natureOfId) {
		this.natureOfId = natureOfId;
	}

	/**
	 * @return the dateIdentified
	 */
	public String getDateIdentified() {
		return dateIdentified;
	}

	/**
	 * @param dateIdentified the dateIdentified to set
	 */
	public void setDateIdentified(String dateIdentified) {
		this.dateIdentified = dateIdentified;
	}

	/**
	 * @return the identificationRemarks
	 */
	public String getIdentificationRemarks() {
		return identificationRemarks;
	}

	/**
	 * @param identificationRemarks the identificationRemarks to set
	 */
	public void setIdentificationRemarks(String identificationRemarks) {
		this.identificationRemarks = identificationRemarks;
	}

	/**
	 * @return the higherGeography
	 */
	public String getHigherGeography() {
		return higherGeography;
	}

	/**
	 * @param higherGeography the higherGeography to set
	 */
	public void setHigherGeography(String higherGeography) {
		this.higherGeography = higherGeography;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPrimaryDivison() {
		return this.primaryDivison;
	}

	public void setPrimaryDivison(String primaryDivison) {
		this.primaryDivison = primaryDivison;
	}

	public String getSpecificLocality() {
		return this.specificLocality;
	}

	public void setSpecificLocality(String specificLocality) {
		this.specificLocality = specificLocality;
	}

	public String getVerbatimLocality() {
		return this.verbatimLocality;
	}

	public void setVerbatimLocality(String verbatimLocality) {
		this.verbatimLocality = verbatimLocality;
	}

//	public String getVerbatimElevation() {
//		return this.verbatimElevation;
//	}
//
//	public void setVerbatimElevation(String verbatimElevation) {
//		this.verbatimElevation = verbatimElevation;
//	}

	/**
	 * @return the verbatimCollector
	 */
	public String getVerbatimCollector() {
		return verbatimCollector;
	}

	/**
	 * @param verbatimCollector the verbatimCollector to set
	 */
	public void setVerbatimCollector(String verbatimCollector) {
		this.verbatimCollector = verbatimCollector;
	}

	/**
	 * @return the verbatimCollection
	 */
	public String getVerbatimCollection() {
		return verbatimCollection;
	}

	/**
	 * @param verbatimCollection the verbatimCollection to set
	 */
	public void setVerbatimCollection(String verbatimCollection) {
		this.verbatimCollection = verbatimCollection;
	}

	/**
	 * @return the verbatimNumbers
	 */
	public String getVerbatimNumbers() {
		return verbatimNumbers;
	}

	/**
	 * @param verbatimNumbers the verbatimNumbers to set
	 */
	public void setVerbatimNumbers(String verbatimNumbers) {
		this.verbatimNumbers = verbatimNumbers;
	}

	/**
	 * @return the verbatimUnclassifiedText
	 */
	public String getVerbatimUnclassifiedText() {
		return verbatimUnclassifiedText;
	}

	/**
	 * @param verbatimUnclassifiedText the verbatimUnclassifiedText to set
	 */
	public void setVerbatimUnclassifiedText(String verbatimUnclassifiedText) {
		this.verbatimUnclassifiedText = verbatimUnclassifiedText;
	}
	
	/**
	 * @return the minimum_elevation
	 */
	public String getMinimumElevationSt() {
		if (minimum_elevation==null) { 
			return null;
		}
		return minimum_elevation.toString();
	}

	/**
	 * @param minimum_elevation the minimum_elevation to set
	 */
	public void setMinimumElevationSt(String minimum_elevation) {
		if (minimum_elevation==null || minimum_elevation.trim().length()==0) { 
			this.minimum_elevation = null;
		} else { 
		    this.minimum_elevation = Long.parseLong(minimum_elevation);
		}
	}	

	/**
	 * @return the verbatimClusterIdentifier
	 */
	public String getVerbatimClusterIdentifier() {
		return verbatimClusterIdentifier;
	}

	/**
	 * @param verbatimClusterIdentifier the verbatimClusterIdentifier to set
	 */
	public void setVerbatimClusterIdentifier(String verbatimClusterIdentifier) {
		this.verbatimClusterIdentifier = verbatimClusterIdentifier;
	}

	/**
	 * @return the externalWorkflowProcess
	 */
	public String getExternalWorkflowProcess() {
		return externalWorkflowProcess;
	}

	/**
	 * @param externalWorkflowProcess the externalWorkflowProcess to set
	 */
	public void setExternalWorkflowProcess(String externalWorkflowProcess) {
		this.externalWorkflowProcess = externalWorkflowProcess;
	}

	/**
	 * @return the externalWorkflowDate
	 */
	public Date getExternalWorkflowDate() {
		return externalWorkflowDate;
	}

	/**
	 * @param externalWorkflowDate the externalWorkflowDate to set
	 */
	public void setExternalWorkflowDate(Date externalWorkflowDate) {
		this.externalWorkflowDate = externalWorkflowDate;
	}

	/**
	 * @return the minimum_elevation
	 */
	public Long getMinimum_elevation() {
		return minimum_elevation;
	}

	/**
	 * @param minimum_elevation the minimum_elevation to set
	 */
	public void setMinimum_elevation(Long minimum_elevation) {
		this.minimum_elevation = minimum_elevation;
	}

	/**
	 * @return the maximum_elevation
	 */
	public String getMaximumElevationSt() {
		if (maximum_elevation==null) { 
			return null;
		}
		return maximum_elevation.toString();
	}

	/**
	 * @param maximum_elevation the maximum_elevation to set
	 */
	public void setMaximumElevationSt(String maximum_elevation) {
		if (maximum_elevation==null || maximum_elevation.trim().length()==0) { 
			this.maximum_elevation = null;
		} else { 
		    this.maximum_elevation = Long.parseLong(maximum_elevation);
		}
	}	
	
	/**
	 * @return the maximum_elevation
	 */
	public Long getMaximum_elevation() {
		return maximum_elevation;
	}

	/**
	 * @param maximum_elevation the maximum_elevation to set
	 */
	public void setMaximum_elevation(Long maximum_elevation) {
		this.maximum_elevation = maximum_elevation;
	}

	/**
	 * @return the elev_units
	 */
	public String getElev_units() {
		return elev_units;
	}

	/**
	 * @param elev_units the elev_units to set
	 */
	public void setElev_units(String elev_units) {
		this.elev_units = elev_units;
	}

	public String getCollectingMethod() {
		return this.collectingMethod;
	}

	public void setCollectingMethod(String collectingMethod) {
		this.collectingMethod = collectingMethod;
	}

	public String getDateNos() {
		return this.dateNos;
	}

	public void setDateNos(String dateNos) {
		this.dateNos = dateNos;
	}

	public String getDateEmerged() {
		return this.dateEmerged;
	}

	public void setDateEmerged(String dateEmerged) {
		this.dateEmerged = dateEmerged;
	}

	public String getDateEmergedIndicator() {
		return this.dateEmergedIndicator;
	}

	public void setDateEmergedIndicator(String dateEmergedIndicator) {
		this.dateEmergedIndicator = dateEmergedIndicator;
	}

	public String getDateCollected() {
		return this.dateCollected;
	}

	public void setDateCollected(String dateCollected) {
		this.dateCollected = dateCollected;
	}

	public String getDateCollectedIndicator() {
		return this.dateCollectedIndicator;
	}

	public void setDateCollectedIndicator(String dateCollectedIndicator) {
		this.dateCollectedIndicator = dateCollectedIndicator;
	}

	public String getCollection() {
		return this.collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public String getSpecimenNotes() {
		return this.specimenNotes;
	}

	public void setSpecimenNotes(String specimenNotes) {
		this.specimenNotes = specimenNotes;
	}

	public String getLifeStage() {
		return this.lifeStage;
	}

	public void setLifeStage(String lifeStage) {
		this.lifeStage = lifeStage;
	}
	

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHabitat() {
		return this.habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	/**
	 * @return the microhabitat
	 */
	public String getMicrohabitat() {
		return microhabitat;
	}

	/**
	 * @param microhabitat the microhabitat to set
	 */
	public void setMicrohabitat(String microhabitat) {
		this.microhabitat = microhabitat;
	}

	public String getAssociatedTaxon() {
		return this.associatedTaxon;
	}

	public void setAssociatedTaxon(String associatedTaxon) {
		this.associatedTaxon = associatedTaxon;
	}

	public String getQuestions() {
		return this.questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getInferences() {
		return this.inferences;
	}

	public void setInferences(String inferences) {
		this.inferences = inferences;
	}

	public String getLocationInCollection() {
		return this.locationInCollection;
	}

	public void setLocationInCollection(String locationInCollection) {
		this.locationInCollection = locationInCollection;
	}

	public String getWorkFlowStatus() {
		return this.workFlowStatus;
	}

	public void setWorkFlowStatus(String workFlowStatus) {
		this.workFlowStatus = workFlowStatus;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getDateCreated() {
		Date result = this.dateCreated;
		return result;
	}

	public void setIsoDate(String isoDate) {
		this.isoDate = isoDate;
	}

	public String getIsoDate() {
		return isoDate;
	}

	public void setDateCreated(Date dateCreated) {
		if (dateCreated==null) { 
			this.dateCreated = null;
		} else { 
		    this.dateCreated = (Date) dateCreated.clone();
		}
	}

	public Date getDateLastUpdated() {
		Date result =  this.dateLastUpdated;
		return result;
	}

	public void setDateLastUpdated(Date dateLastUpdated) {
		if (dateLastUpdated==null) { 
			this.dateLastUpdated = null;
		} else { 
		    this.dateLastUpdated = (Date) dateLastUpdated.clone();
		} 
	}

	public String getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Boolean getValidDistributionFlag() {
		return this.validDistributionFlag;
	}

	public void setValidDistributionFlag(Boolean validDistributionFlag) {
		this.validDistributionFlag = validDistributionFlag;
	}

	/**
	 * @return the flagInBulkloader
	 */
	public Boolean getFlagInBulkloader() {
		return flagInBulkloader;
	}

	/**
	 * @param flagInBulkloader the flagInBulkloader to set
	 */
	public void setFlagInBulkloader(Boolean flagInBulkloader) {
		this.flagInBulkloader = flagInBulkloader;
	}

	/**
	 * @return the flagInMCZbase
	 */
	public Boolean getFlagInMCZbase() {
		return flagInMCZbase;
	}

	/**
	 * @param flagInMCZbase the flagInMCZbase to set
	 */
	public void setFlagInMCZbase(Boolean flagInMCZbase) {
		this.flagInMCZbase = flagInMCZbase;
	}

	/**
	 * @return the flagAncilaryAlsoInMCZbase
	 */
	public Boolean getFlagAncilaryAlsoInMCZbase() {
		return flagAncilaryAlsoInMCZbase;
	}

	/**
	 * @param flagAncilaryAlsoInMCZbase the flagAncilaryAlsoInMCZbase to set
	 */
	public void setFlagAncilaryAlsoInMCZbase(Boolean flagAncilaryAlsoInMCZbase) {
		this.flagAncilaryAlsoInMCZbase = flagAncilaryAlsoInMCZbase;
	}

	/**
	 * @return the locality_id
	 */
	public Long getLocality_id() {
		return locality_id;
	}

	/**
	 * @param locality_id the locality_id to set
	 */
	public void setLocality_id(Long locality_id) {
		this.locality_id = locality_id;
	}

	/** get locality_id as a string
	 * @return the locality_id
	 */
	public String getLocalityId() {
		if (locality_id==null) {
			return null;
		} else { 
			return locality_id.toString();
		}
	}

	/** Set the numeric locality id value from a string, ignore empty strings.
	 * @param locality_id the locality_id to set
	 */
	public void setLocalityId(String locality_id) {
		if (locality_id == null) { 
			this.locality_id=null;
		} else { 
			if (locality_id.trim().length() > 0) { 
				this.locality_id = Long.parseLong(locality_id);
			}
		}
	}

	/**
	 * @return the collecting_event_id
	 */
	public Long getCollecting_event_id() {
		return collecting_event_id;
	}

	/**
	 * @param collecting_event_id the collecting_event_id to set
	 */
	public void setCollecting_event_id(Long collecting_event_id) {
		this.collecting_event_id = collecting_event_id;
	}

	/** get the collecting event id as a string
	 * @return the collecting_event_id
	 */
	public String getCollectingEventId() {
		if (collecting_event_id==null) { 
			return "";
		} else { 
			return collecting_event_id.toString();

		}
	}		

	/** Set the numeric collecting_event_id value from a string, ignore empty strings.
	 * @param collecting_event_id the collecting_event_id to set
	 */
	public void setCollectingEventId(String collecting_event_id) {
		if (collecting_event_id ==null) { 
			this.collecting_event_id = null;	
		} else {
			if (collecting_event_id.trim().length() > 0) {
				this.collecting_event_id = Long.parseLong(collecting_event_id);
			}
		}
	}
	
	/**
	 * @return the path
	 */
	public String getCreatingPath() {
		return creatingPath;
	}

	/**
	 * @param path the path to set
	 */
	public void setCreatingPath(String path) {
		this.creatingPath = path;
	}

	/**
	 * @return the creatingFilename
	 */
	public String getCreatingFilename() {
		return creatingFilename;
	}

	/**
	 * @param creatingFilename the creatingFilename to set
	 */
	public void setCreatingFilename(String creatingFilename) {
		this.creatingFilename = creatingFilename;
	}

	public Set<Collector> getCollectors() {
		return this.collectors;
	}

	public void setCollectors(Set<Collector> collectors) {
		this.collectors = collectors;
	}

	public Set<Determination> getDeterminations() {
		return this.determinations;
	}

	public void setDeterminations(Set<Determination> determinations) {
		this.determinations = determinations;
	}

	public Set<Tracking> getTrackings() {
		return this.trackings;
	}

	public void setTrackings(Set<Tracking> trackings) {
		this.trackings = trackings;
	}

	public Set<Number> getNumbers() {
		return this.numbers;
	}

	public void setNumbers(Set<Number> numbers) {
		this.numbers = numbers;
	}

	public Set<ICImage> getICImages() {
		return this.ICImages;
	}

	public void setICImages(Set<ICImage> ICImages) {
		this.ICImages = ICImages;
	}
	
	/**
	 * @return the specimenParts
	 */
	public Set<SpecimenPart> getSpecimenParts() {
		return specimenParts;
	}

	/**
	 * @param specimenParts the specimenParts to set
	 */
	public void setSpecimenParts(Set<SpecimenPart> specimenParts) {
		this.specimenParts = specimenParts;
	}
	
	public Set<LatLong> getLatLong() {
		if (georeferences==null) { 
			georeferences = new HashSet<LatLong>();
		}
		if (georeferences.isEmpty()) { 
			LatLong georef = new LatLong();
			georef.setSpecimenId(this);
			georeferences.add(georef);
		}
		return georeferences;
	}	
	
	public void setLatLong(Set<LatLong> latlongs) {
		this.georeferences = latlongs;
	}	

	/**
	 * @return the externalHistory
	 */
	public Set<ExternalHistory> getExternalHistory() {
		return externalHistory;
	}

	/**
	 * @param externalHistory the externalHistory to set
	 */
	public void setExternalHistory(Set<ExternalHistory> externalHistory) {
		this.externalHistory = externalHistory;
	}

	public boolean isStateDone() {
		boolean result = false;
		if (this.workFlowStatus.equals(WorkFlowStatus.STAGE_DONE)) {
		   result = true;
		}
		return result;
	}	
	
	public String getLoadFlags() {
		String result = "Unexpected State";
		if (flagInBulkloader==false && flagInMCZbase==false && flagAncilaryAlsoInMCZbase==false) {
           result = "In DataShot";
		}
		if (flagInBulkloader==true && flagInMCZbase==false && flagAncilaryAlsoInMCZbase==false) {
           result = "In Bulkloader";
		}
		if (flagInBulkloader==true && flagInMCZbase==true && flagAncilaryAlsoInMCZbase==false) {
           result = "Adding Image and Ids.";
		}
		if (flagInBulkloader==true && flagInMCZbase==true && flagAncilaryAlsoInMCZbase==true) {
           result = WorkFlowStatus.STAGE_DONE;
		}
		return result;
	}
	
	public void attachNewPart() {  					
		SpecimenPart newPart = new SpecimenPart();
		newPart.setPreserveMethod(Singleton.getSingletonInstance().getProperties().getProperties().getProperty(ImageCaptureProperties.KEY_DEFAULT_PREPARATION));
		newPart.setSpecimenId(this);
		SpecimenPartLifeCycle spls = new SpecimenPartLifeCycle();
		try {
			spls.persist(newPart);
			this.getSpecimenParts().add(newPart);
		} catch (SaveFailedException e1) {
			log.error(e1.getMessage(),e1);
		}
	}
	
	/**
	 * Set the value of specificLocality to a string that has a meaning
	 * of there being no specific locality data.  MCZbase requires a 
	 * non-null value for specific locality on bulkloader ingest.
	 */
	public void noSpecificLocalityData() { 
		this.specificLocality = "[no specific locality data]";
	}
	
	/**
	 * Assemble relevant fields of the current identification into a scientific name.
	 * 
	 * @return
	 */
	public String assembleScientificName() { 
		StringBuffer result = new StringBuffer();
		result.append(genus).append(" ").append(specificEpithet).append(" ").append(this.infraspecificRank).append(" ").append(this.infraspecificEpithet);
		
		return result.toString().trim();
	}

}
