# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyEntityRefactorDetails(object):
    """
    Request for refactoring a design-time ontology entity IRI across project Turtle files.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyEntityRefactorDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param entity_type:
            The value to assign to the entity_type property of this OntologyEntityRefactorDetails.
        :type entity_type: str

        :param iri:
            The value to assign to the iri property of this OntologyEntityRefactorDetails.
        :type iri: str

        :param new_iri:
            The value to assign to the new_iri property of this OntologyEntityRefactorDetails.
        :type new_iri: str

        :param prefix:
            The value to assign to the prefix property of this OntologyEntityRefactorDetails.
        :type prefix: str

        :param new_prefix:
            The value to assign to the new_prefix property of this OntologyEntityRefactorDetails.
        :type new_prefix: str

        """
        self.swagger_types = {
            'entity_type': 'str',
            'iri': 'str',
            'new_iri': 'str',
            'prefix': 'str',
            'new_prefix': 'str'
        }

        self.attribute_map = {
            'entity_type': 'entityType',
            'iri': 'iri',
            'new_iri': 'newIri',
            'prefix': 'prefix',
            'new_prefix': 'newPrefix'
        }

        self._entity_type = None
        self._iri = None
        self._new_iri = None
        self._prefix = None
        self._new_prefix = None

    @property
    def entity_type(self):
        """
        **[Required]** Gets the entity_type of this OntologyEntityRefactorDetails.
        Entity type to refactor. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap. Uppercase aliases ONTOLOGY, CLASS, PROPERTY, and RELATIONSHIP are also accepted.


        :return: The entity_type of this OntologyEntityRefactorDetails.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type):
        """
        Sets the entity_type of this OntologyEntityRefactorDetails.
        Entity type to refactor. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap. Uppercase aliases ONTOLOGY, CLASS, PROPERTY, and RELATIONSHIP are also accepted.


        :param entity_type: The entity_type of this OntologyEntityRefactorDetails.
        :type: str
        """
        self._entity_type = entity_type

    @property
    def iri(self):
        """
        **[Required]** Gets the iri of this OntologyEntityRefactorDetails.
        Current ontology entity IRI.


        :return: The iri of this OntologyEntityRefactorDetails.
        :rtype: str
        """
        return self._iri

    @iri.setter
    def iri(self, iri):
        """
        Sets the iri of this OntologyEntityRefactorDetails.
        Current ontology entity IRI.


        :param iri: The iri of this OntologyEntityRefactorDetails.
        :type: str
        """
        self._iri = iri

    @property
    def new_iri(self):
        """
        **[Required]** Gets the new_iri of this OntologyEntityRefactorDetails.
        Replacement ontology entity IRI.


        :return: The new_iri of this OntologyEntityRefactorDetails.
        :rtype: str
        """
        return self._new_iri

    @new_iri.setter
    def new_iri(self, new_iri):
        """
        Sets the new_iri of this OntologyEntityRefactorDetails.
        Replacement ontology entity IRI.


        :param new_iri: The new_iri of this OntologyEntityRefactorDetails.
        :type: str
        """
        self._new_iri = new_iri

    @property
    def prefix(self):
        """
        Gets the prefix of this OntologyEntityRefactorDetails.
        Optional current ontology namespace prefix to replace. Not required for class refactors.


        :return: The prefix of this OntologyEntityRefactorDetails.
        :rtype: str
        """
        return self._prefix

    @prefix.setter
    def prefix(self, prefix):
        """
        Sets the prefix of this OntologyEntityRefactorDetails.
        Optional current ontology namespace prefix to replace. Not required for class refactors.


        :param prefix: The prefix of this OntologyEntityRefactorDetails.
        :type: str
        """
        self._prefix = prefix

    @property
    def new_prefix(self):
        """
        Gets the new_prefix of this OntologyEntityRefactorDetails.
        Optional replacement ontology namespace prefix. Not required for class refactors.


        :return: The new_prefix of this OntologyEntityRefactorDetails.
        :rtype: str
        """
        return self._new_prefix

    @new_prefix.setter
    def new_prefix(self, new_prefix):
        """
        Sets the new_prefix of this OntologyEntityRefactorDetails.
        Optional replacement ontology namespace prefix. Not required for class refactors.


        :param new_prefix: The new_prefix of this OntologyEntityRefactorDetails.
        :type: str
        """
        self._new_prefix = new_prefix

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
