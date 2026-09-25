# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyPublishTargetConnectionReference(object):
    """
    Credential Store or external catalog reference for the ATP/ADW connection used by ontology publish.
    Provide `type` and `key`. Legacy `credentialKey` and `catalogKey` payloads are also accepted.
    `namespace` is valid only with Credential Store targets.
    """

    #: A constant which can be used with the type property of a OntologyPublishTargetConnectionReference.
    #: This constant has a value of "CREDENTIAL_STORE"
    TYPE_CREDENTIAL_STORE = "CREDENTIAL_STORE"

    #: A constant which can be used with the type property of a OntologyPublishTargetConnectionReference.
    #: This constant has a value of "EXTERNAL_CATALOG"
    TYPE_EXTERNAL_CATALOG = "EXTERNAL_CATALOG"

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyPublishTargetConnectionReference object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this OntologyPublishTargetConnectionReference.
            Allowed values for this property are: "CREDENTIAL_STORE", "EXTERNAL_CATALOG"
        :type type: str

        :param key:
            The value to assign to the key property of this OntologyPublishTargetConnectionReference.
        :type key: str

        :param credential_key:
            The value to assign to the credential_key property of this OntologyPublishTargetConnectionReference.
        :type credential_key: str

        :param catalog_key:
            The value to assign to the catalog_key property of this OntologyPublishTargetConnectionReference.
        :type catalog_key: str

        :param namespace:
            The value to assign to the namespace property of this OntologyPublishTargetConnectionReference.
        :type namespace: str

        :param schema:
            The value to assign to the schema property of this OntologyPublishTargetConnectionReference.
        :type schema: str

        """
        self.swagger_types = {
            'type': 'str',
            'key': 'str',
            'credential_key': 'str',
            'catalog_key': 'str',
            'namespace': 'str',
            'schema': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'key': 'key',
            'credential_key': 'credentialKey',
            'catalog_key': 'catalogKey',
            'namespace': 'namespace',
            'schema': 'schema'
        }

        self._type = None
        self._key = None
        self._credential_key = None
        self._catalog_key = None
        self._namespace = None
        self._schema = None

    @property
    def type(self):
        """
        Gets the type of this OntologyPublishTargetConnectionReference.
        Target connection reference type. Required when `key` is supplied.

        Allowed values for this property are: "CREDENTIAL_STORE", "EXTERNAL_CATALOG"


        :return: The type of this OntologyPublishTargetConnectionReference.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this OntologyPublishTargetConnectionReference.
        Target connection reference type. Required when `key` is supplied.


        :param type: The type of this OntologyPublishTargetConnectionReference.
        :type: str
        """
        allowed_values = ["CREDENTIAL_STORE", "EXTERNAL_CATALOG"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def key(self):
        """
        Gets the key of this OntologyPublishTargetConnectionReference.
        Credential Store key or ADW external catalog key. Required when `type` is supplied.


        :return: The key of this OntologyPublishTargetConnectionReference.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this OntologyPublishTargetConnectionReference.
        Credential Store key or ADW external catalog key. Required when `type` is supplied.


        :param key: The key of this OntologyPublishTargetConnectionReference.
        :type: str
        """
        self._key = key

    @property
    def credential_key(self):
        """
        Gets the credential_key of this OntologyPublishTargetConnectionReference.
        Deprecated. Credential Store key containing the target ATP/ADW connection secret pairs.


        :return: The credential_key of this OntologyPublishTargetConnectionReference.
        :rtype: str
        """
        return self._credential_key

    @credential_key.setter
    def credential_key(self, credential_key):
        """
        Sets the credential_key of this OntologyPublishTargetConnectionReference.
        Deprecated. Credential Store key containing the target ATP/ADW connection secret pairs.


        :param credential_key: The credential_key of this OntologyPublishTargetConnectionReference.
        :type: str
        """
        self._credential_key = credential_key

    @property
    def catalog_key(self):
        """
        Gets the catalog_key of this OntologyPublishTargetConnectionReference.
        Deprecated. ADW external catalog key whose decrypted connection properties should be used as the ontology publish target.


        :return: The catalog_key of this OntologyPublishTargetConnectionReference.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this OntologyPublishTargetConnectionReference.
        Deprecated. ADW external catalog key whose decrypted connection properties should be used as the ontology publish target.


        :param catalog_key: The catalog_key of this OntologyPublishTargetConnectionReference.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def namespace(self):
        """
        Gets the namespace of this OntologyPublishTargetConnectionReference.
        Credential Store namespace. Defaults to `default` when omitted for Credential Store targets; not used with external catalog targets.


        :return: The namespace of this OntologyPublishTargetConnectionReference.
        :rtype: str
        """
        return self._namespace

    @namespace.setter
    def namespace(self, namespace):
        """
        Sets the namespace of this OntologyPublishTargetConnectionReference.
        Credential Store namespace. Defaults to `default` when omitted for Credential Store targets; not used with external catalog targets.


        :param namespace: The namespace of this OntologyPublishTargetConnectionReference.
        :type: str
        """
        self._namespace = namespace

    @property
    def schema(self):
        """
        Gets the schema of this OntologyPublishTargetConnectionReference.
        Target ATP schema for generated ontology objects. Overrides the credential schema secret when supplied.


        :return: The schema of this OntologyPublishTargetConnectionReference.
        :rtype: str
        """
        return self._schema

    @schema.setter
    def schema(self, schema):
        """
        Sets the schema of this OntologyPublishTargetConnectionReference.
        Target ATP schema for generated ontology objects. Overrides the credential schema secret when supplied.


        :param schema: The schema of this OntologyPublishTargetConnectionReference.
        :type: str
        """
        self._schema = schema

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
