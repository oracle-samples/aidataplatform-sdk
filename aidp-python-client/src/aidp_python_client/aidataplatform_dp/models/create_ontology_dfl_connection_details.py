# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateOntologyDflConnectionDetails(object):
    """
    Request to register (upsert) a DFL connection. `sourceType` selects how Ontology Manager
    obtains the connection's coordinates and credentials. For the resolved source types it reads
    them under the caller's identity and this body carries no secrets.
    """

    #: A constant which can be used with the source_type property of a CreateOntologyDflConnectionDetails.
    #: This constant has a value of "CATALOG_CONNECTION"
    SOURCE_TYPE_CATALOG_CONNECTION = "CATALOG_CONNECTION"

    #: A constant which can be used with the source_type property of a CreateOntologyDflConnectionDetails.
    #: This constant has a value of "CRED_STORE"
    SOURCE_TYPE_CRED_STORE = "CRED_STORE"

    #: A constant which can be used with the source_type property of a CreateOntologyDflConnectionDetails.
    #: This constant has a value of "INLINE"
    SOURCE_TYPE_INLINE = "INLINE"

    def __init__(self, **kwargs):
        """
        Initializes a new CreateOntologyDflConnectionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param source_type:
            The value to assign to the source_type property of this CreateOntologyDflConnectionDetails.
            Allowed values for this property are: "CATALOG_CONNECTION", "CRED_STORE", "INLINE"
        :type source_type: str

        :param key:
            The value to assign to the key property of this CreateOntologyDflConnectionDetails.
        :type key: str

        :param namespace:
            The value to assign to the namespace property of this CreateOntologyDflConnectionDetails.
        :type namespace: str

        :param uri:
            The value to assign to the uri property of this CreateOntologyDflConnectionDetails.
        :type uri: str

        :param kind:
            The value to assign to the kind property of this CreateOntologyDflConnectionDetails.
        :type kind: str

        :param properties:
            The value to assign to the properties property of this CreateOntologyDflConnectionDetails.
        :type properties: dict(str, str)

        :param property_overrides:
            The value to assign to the property_overrides property of this CreateOntologyDflConnectionDetails.
        :type property_overrides: dict(str, str)

        """
        self.swagger_types = {
            'source_type': 'str',
            'key': 'str',
            'namespace': 'str',
            'uri': 'str',
            'kind': 'str',
            'properties': 'dict(str, str)',
            'property_overrides': 'dict(str, str)'
        }
        self.attribute_map = {
            'source_type': 'sourceType',
            'key': 'key',
            'namespace': 'namespace',
            'uri': 'uri',
            'kind': 'kind',
            'properties': 'properties',
            'property_overrides': 'propertyOverrides'
        }
        self._source_type = None
        self._key = None
        self._namespace = None
        self._uri = None
        self._kind = None
        self._properties = None
        self._property_overrides = None

    @property
    def source_type(self):
        """
        **[Required]** Gets the source_type of this CreateOntologyDflConnectionDetails.
        CATALOG_CONNECTION resolves an AIDP external ADW catalog by `key`; CRED_STORE resolves a
        Credential Store entry by `key`; INLINE registers the `uri`, `kind` and `properties` in
        this request.

        Allowed values for this property are: "CATALOG_CONNECTION", "CRED_STORE", "INLINE"


        :return: The source_type of this CreateOntologyDflConnectionDetails.
        :rtype: str
        """
        return self._source_type

    @source_type.setter
    def source_type(self, source_type):
        """
        Sets the source_type of this CreateOntologyDflConnectionDetails.
        CATALOG_CONNECTION resolves an AIDP external ADW catalog by `key`; CRED_STORE resolves a
        Credential Store entry by `key`; INLINE registers the `uri`, `kind` and `properties` in
        this request.


        :param source_type: The source_type of this CreateOntologyDflConnectionDetails.
        :type: str
        """
        allowed_values = ["CATALOG_CONNECTION", "CRED_STORE", "INLINE"]
        if not value_allowed_none_or_none_sentinel(source_type, allowed_values):
            raise ValueError(
                f"Invalid value for `source_type`, must be None or one of {allowed_values}"
            )
        self._source_type = source_type

    @property
    def key(self):
        """
        Gets the key of this CreateOntologyDflConnectionDetails.
        Catalog key or Credential Store key. Required unless `sourceType` is INLINE.


        :return: The key of this CreateOntologyDflConnectionDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this CreateOntologyDflConnectionDetails.
        Catalog key or Credential Store key. Required unless `sourceType` is INLINE.


        :param key: The key of this CreateOntologyDflConnectionDetails.
        :type: str
        """
        self._key = key

    @property
    def namespace(self):
        """
        Gets the namespace of this CreateOntologyDflConnectionDetails.
        Credential Store namespace. CRED_STORE only; defaults to `default`.


        :return: The namespace of this CreateOntologyDflConnectionDetails.
        :rtype: str
        """
        return self._namespace

    @namespace.setter
    def namespace(self, namespace):
        """
        Sets the namespace of this CreateOntologyDflConnectionDetails.
        Credential Store namespace. CRED_STORE only; defaults to `default`.


        :param namespace: The namespace of this CreateOntologyDflConnectionDetails.
        :type: str
        """
        self._namespace = namespace

    @property
    def uri(self):
        """
        Gets the uri of this CreateOntologyDflConnectionDetails.
        DFL connection URI to register, for example `duckdb://analytics`. Required for INLINE;
        for the resolved source types it defaults to `oracle://<key>`, and supplying it registers
        the resolved connection under a second URI.


        :return: The uri of this CreateOntologyDflConnectionDetails.
        :rtype: str
        """
        return self._uri

    @uri.setter
    def uri(self, uri):
        """
        Sets the uri of this CreateOntologyDflConnectionDetails.
        DFL connection URI to register, for example `duckdb://analytics`. Required for INLINE;
        for the resolved source types it defaults to `oracle://<key>`, and supplying it registers
        the resolved connection under a second URI.


        :param uri: The uri of this CreateOntologyDflConnectionDetails.
        :type: str
        """
        self._uri = uri

    @property
    def kind(self):
        """
        Gets the kind of this CreateOntologyDflConnectionDetails.
        DFL connection kind (`duckdb`, `jdbc`, ...). INLINE only; resolved source types are always `jdbc`.


        :return: The kind of this CreateOntologyDflConnectionDetails.
        :rtype: str
        """
        return self._kind

    @kind.setter
    def kind(self, kind):
        """
        Sets the kind of this CreateOntologyDflConnectionDetails.
        DFL connection kind (`duckdb`, `jdbc`, ...). INLINE only; resolved source types are always `jdbc`.


        :param kind: The kind of this CreateOntologyDflConnectionDetails.
        :type: str
        """
        self._kind = kind

    @property
    def properties(self):
        """
        Gets the properties of this CreateOntologyDflConnectionDetails.
        DFL per-kind connection properties. INLINE only; the `type` property DFL requires is
        derived from `kind` when absent. May carry secrets; excluded from audit events.


        :return: The properties of this CreateOntologyDflConnectionDetails.
        :rtype: dict(str, str)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this CreateOntologyDflConnectionDetails.
        DFL per-kind connection properties. INLINE only; the `type` property DFL requires is
        derived from `kind` when absent. May carry secrets; excluded from audit events.


        :param properties: The properties of this CreateOntologyDflConnectionDetails.
        :type: dict(str, str)
        """
        self._properties = properties

    @property
    def property_overrides(self):
        """
        Gets the property_overrides of this CreateOntologyDflConnectionDetails.
        Merged last over the resolved properties, for what the source does not carry such as a
        `wallet_path`. Not valid for INLINE. May carry secrets; excluded from audit events.


        :return: The property_overrides of this CreateOntologyDflConnectionDetails.
        :rtype: dict(str, str)
        """
        return self._property_overrides

    @property_overrides.setter
    def property_overrides(self, property_overrides):
        """
        Sets the property_overrides of this CreateOntologyDflConnectionDetails.
        Merged last over the resolved properties, for what the source does not carry such as a
        `wallet_path`. Not valid for INLINE. May carry secrets; excluded from audit events.


        :param property_overrides: The property_overrides of this CreateOntologyDflConnectionDetails.
        :type: dict(str, str)
        """
        self._property_overrides = property_overrides

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
