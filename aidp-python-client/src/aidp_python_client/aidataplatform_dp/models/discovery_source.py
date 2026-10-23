# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DiscoverySource(object):
    """
    DiscoverySource model.
    """

    #: A constant which can be used with the source_type property of a DiscoverySource.
    #: This constant has a value of "CATALOG_CONNECTION"
    SOURCE_TYPE_CATALOG_CONNECTION = "CATALOG_CONNECTION"

    #: A constant which can be used with the source_type property of a DiscoverySource.
    #: This constant has a value of "CRED_STORE"
    SOURCE_TYPE_CRED_STORE = "CRED_STORE"

    #: A constant which can be used with the source_type property of a DiscoverySource.
    #: This constant has a value of "TTL"
    SOURCE_TYPE_TTL = "TTL"

    #: A constant which can be used with the source_type property of a DiscoverySource.
    #: This constant has a value of "DOCUMENTS"
    SOURCE_TYPE_DOCUMENTS = "DOCUMENTS"

    #: A constant which can be used with the catalog_type property of a DiscoverySource.
    #: This constant has a value of "INTERNAL"
    CATALOG_TYPE_INTERNAL = "INTERNAL"

    #: A constant which can be used with the catalog_type property of a DiscoverySource.
    #: This constant has a value of "EXTERNAL"
    CATALOG_TYPE_EXTERNAL = "EXTERNAL"

    #: A constant which can be used with the mode property of a DiscoverySource.
    #: This constant has a value of "BUILD_FROM_SCRATCH"
    MODE_BUILD_FROM_SCRATCH = "BUILD_FROM_SCRATCH"

    #: A constant which can be used with the mode property of a DiscoverySource.
    #: This constant has a value of "ENRICH"
    MODE_ENRICH = "ENRICH"

    #: A constant which can be used with the mode property of a DiscoverySource.
    #: This constant has a value of "DISCOVER"
    MODE_DISCOVER = "DISCOVER"

    def __init__(self, **kwargs):
        """
        Initializes a new DiscoverySource object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param source_type:
            The value to assign to the source_type property of this DiscoverySource.
            Allowed values for this property are: "CATALOG_CONNECTION", "CRED_STORE", "TTL", "DOCUMENTS"
        :type source_type: str

        :param kind:
            The value to assign to the kind property of this DiscoverySource.
        :type kind: str

        :param key:
            The value to assign to the key property of this DiscoverySource.
        :type key: str

        :param catalog_type:
            The value to assign to the catalog_type property of this DiscoverySource.
            Allowed values for this property are: "INTERNAL", "EXTERNAL"
        :type catalog_type: str

        :param profiling:
            The value to assign to the profiling property of this DiscoverySource.
        :type profiling: bool

        :param location:
            The value to assign to the location property of this DiscoverySource.
        :type location: oci.aidataplatform_dp.models.DiscoveryLocation

        :param ontology_ttl:
            The value to assign to the ontology_ttl property of this DiscoverySource.
        :type ontology_ttl: oci.aidataplatform_dp.models.DiscoveryLocation

        :param mode:
            The value to assign to the mode property of this DiscoverySource.
            Allowed values for this property are: "BUILD_FROM_SCRATCH", "ENRICH", "DISCOVER"
        :type mode: str

        :param validate_only:
            The value to assign to the validate_only property of this DiscoverySource.
        :type validate_only: bool

        :param selection:
            The value to assign to the selection property of this DiscoverySource.
        :type selection: oci.aidataplatform_dp.models.DiscoverySelection

        """
        self.swagger_types = {
            'source_type': 'str',
            'kind': 'str',
            'key': 'str',
            'catalog_type': 'str',
            'profiling': 'bool',
            'location': 'DiscoveryLocation',
            'ontology_ttl': 'DiscoveryLocation',
            'mode': 'str',
            'validate_only': 'bool',
            'selection': 'DiscoverySelection'
        }
        self.attribute_map = {
            'source_type': 'sourceType',
            'kind': 'kind',
            'key': 'key',
            'catalog_type': 'catalogType',
            'profiling': 'profiling',
            'location': 'location',
            'ontology_ttl': 'ontologyTtl',
            'mode': 'mode',
            'validate_only': 'validateOnly',
            'selection': 'selection'
        }
        self._source_type = None
        self._kind = None
        self._key = None
        self._catalog_type = None
        self._profiling = None
        self._location = None
        self._ontology_ttl = None
        self._mode = None
        self._validate_only = None
        self._selection = None

    @property
    def source_type(self):
        """
        **[Required]** Gets the source_type of this DiscoverySource.
        Allowed values for this property are: "CATALOG_CONNECTION", "CRED_STORE", "TTL", "DOCUMENTS"


        :return: The source_type of this DiscoverySource.
        :rtype: str
        """
        return self._source_type

    @source_type.setter
    def source_type(self, source_type):
        """
        Sets the source_type of this DiscoverySource.

        :param source_type: The source_type of this DiscoverySource.
        :type: str
        """
        allowed_values = ["CATALOG_CONNECTION", "CRED_STORE", "TTL", "DOCUMENTS"]
        if not value_allowed_none_or_none_sentinel(source_type, allowed_values):
            raise ValueError(
                f"Invalid value for `source_type`, must be None or one of {allowed_values}"
            )
        self._source_type = source_type

    @property
    def kind(self):
        """
        Gets the kind of this DiscoverySource.
        Source kind forwarded to DFL; defaults per sourceType (catalog, credential_store, volume)


        :return: The kind of this DiscoverySource.
        :rtype: str
        """
        return self._kind

    @kind.setter
    def kind(self, kind):
        """
        Sets the kind of this DiscoverySource.
        Source kind forwarded to DFL; defaults per sourceType (catalog, credential_store, volume)


        :param kind: The kind of this DiscoverySource.
        :type: str
        """
        self._kind = kind

    @property
    def key(self):
        """
        Gets the key of this DiscoverySource.
        Connection or catalog key; volume key for DOCUMENTS and TTL sources


        :return: The key of this DiscoverySource.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this DiscoverySource.
        Connection or catalog key; volume key for DOCUMENTS and TTL sources


        :param key: The key of this DiscoverySource.
        :type: str
        """
        self._key = key

    @property
    def catalog_type(self):
        """
        Gets the catalog_type of this DiscoverySource.
        Allowed values for this property are: "INTERNAL", "EXTERNAL"


        :return: The catalog_type of this DiscoverySource.
        :rtype: str
        """
        return self._catalog_type

    @catalog_type.setter
    def catalog_type(self, catalog_type):
        """
        Sets the catalog_type of this DiscoverySource.

        :param catalog_type: The catalog_type of this DiscoverySource.
        :type: str
        """
        allowed_values = ["INTERNAL", "EXTERNAL"]
        if not value_allowed_none_or_none_sentinel(catalog_type, allowed_values):
            raise ValueError(
                f"Invalid value for `catalog_type`, must be None or one of {allowed_values}"
            )
        self._catalog_type = catalog_type

    @property
    def profiling(self):
        """
        Gets the profiling of this DiscoverySource.

        :return: The profiling of this DiscoverySource.
        :rtype: bool
        """
        return self._profiling

    @profiling.setter
    def profiling(self, profiling):
        """
        Sets the profiling of this DiscoverySource.

        :param profiling: The profiling of this DiscoverySource.
        :type: bool
        """
        self._profiling = profiling

    @property
    def location(self):
        """
        Gets the location of this DiscoverySource.

        :return: The location of this DiscoverySource.
        :rtype: oci.aidataplatform_dp.models.DiscoveryLocation
        """
        return self._location

    @location.setter
    def location(self, location):
        """
        Sets the location of this DiscoverySource.

        :param location: The location of this DiscoverySource.
        :type: oci.aidataplatform_dp.models.DiscoveryLocation
        """
        self._location = location

    @property
    def ontology_ttl(self):
        """
        Gets the ontology_ttl of this DiscoverySource.

        :return: The ontology_ttl of this DiscoverySource.
        :rtype: oci.aidataplatform_dp.models.DiscoveryLocation
        """
        return self._ontology_ttl

    @ontology_ttl.setter
    def ontology_ttl(self, ontology_ttl):
        """
        Sets the ontology_ttl of this DiscoverySource.

        :param ontology_ttl: The ontology_ttl of this DiscoverySource.
        :type: oci.aidataplatform_dp.models.DiscoveryLocation
        """
        self._ontology_ttl = ontology_ttl

    @property
    def mode(self):
        """
        Gets the mode of this DiscoverySource.
        Allowed values for this property are: "BUILD_FROM_SCRATCH", "ENRICH", "DISCOVER"


        :return: The mode of this DiscoverySource.
        :rtype: str
        """
        return self._mode

    @mode.setter
    def mode(self, mode):
        """
        Sets the mode of this DiscoverySource.

        :param mode: The mode of this DiscoverySource.
        :type: str
        """
        allowed_values = ["BUILD_FROM_SCRATCH", "ENRICH", "DISCOVER"]
        if not value_allowed_none_or_none_sentinel(mode, allowed_values):
            raise ValueError(
                f"Invalid value for `mode`, must be None or one of {allowed_values}"
            )
        self._mode = mode

    @property
    def validate_only(self):
        """
        Gets the validate_only of this DiscoverySource.

        :return: The validate_only of this DiscoverySource.
        :rtype: bool
        """
        return self._validate_only

    @validate_only.setter
    def validate_only(self, validate_only):
        """
        Sets the validate_only of this DiscoverySource.

        :param validate_only: The validate_only of this DiscoverySource.
        :type: bool
        """
        self._validate_only = validate_only

    @property
    def selection(self):
        """
        Gets the selection of this DiscoverySource.

        :return: The selection of this DiscoverySource.
        :rtype: oci.aidataplatform_dp.models.DiscoverySelection
        """
        return self._selection

    @selection.setter
    def selection(self, selection):
        """
        Sets the selection of this DiscoverySource.

        :param selection: The selection of this DiscoverySource.
        :type: oci.aidataplatform_dp.models.DiscoverySelection
        """
        self._selection = selection

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
