# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyPublishTargetConnectionReference(object):
    """
    Credential Store reference for the ATP connection used by ontology publish.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyPublishTargetConnectionReference object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param credential_key:
            The value to assign to the credential_key property of this OntologyPublishTargetConnectionReference.
        :type credential_key: str

        :param namespace:
            The value to assign to the namespace property of this OntologyPublishTargetConnectionReference.
        :type namespace: str

        :param schema:
            The value to assign to the schema property of this OntologyPublishTargetConnectionReference.
        :type schema: str

        """
        self.swagger_types = {
            'credential_key': 'str',
            'namespace': 'str',
            'schema': 'str'
        }

        self.attribute_map = {
            'credential_key': 'credentialKey',
            'namespace': 'namespace',
            'schema': 'schema'
        }

        self._credential_key = None
        self._namespace = None
        self._schema = None

    @property
    def credential_key(self):
        """
        **[Required]** Gets the credential_key of this OntologyPublishTargetConnectionReference.
        Credential Store key containing the target ATP connection secret pairs.


        :return: The credential_key of this OntologyPublishTargetConnectionReference.
        :rtype: str
        """
        return self._credential_key

    @credential_key.setter
    def credential_key(self, credential_key):
        """
        Sets the credential_key of this OntologyPublishTargetConnectionReference.
        Credential Store key containing the target ATP connection secret pairs.


        :param credential_key: The credential_key of this OntologyPublishTargetConnectionReference.
        :type: str
        """
        self._credential_key = credential_key

    @property
    def namespace(self):
        """
        Gets the namespace of this OntologyPublishTargetConnectionReference.
        Credential Store namespace. Defaults to `default` when omitted.


        :return: The namespace of this OntologyPublishTargetConnectionReference.
        :rtype: str
        """
        return self._namespace

    @namespace.setter
    def namespace(self, namespace):
        """
        Sets the namespace of this OntologyPublishTargetConnectionReference.
        Credential Store namespace. Defaults to `default` when omitted.


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
